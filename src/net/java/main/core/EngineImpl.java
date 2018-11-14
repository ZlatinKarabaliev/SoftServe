package net.java.main.core;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import net.java.main.dispachers.CommandDispatcher;
import net.java.main.exceptions.*;
import net.java.main.interfaces.Engine;
import net.java.main.interfaces.InputReader;
import net.java.main.interfaces.OutputWriter;

import java.io.IOException;
import java.io.Reader;

import static net.java.main.constants.GameConstants.TERMINATE_OUTPUT;

public class EngineImpl implements Engine {
	
	public static final String FILE_NAME = "jsonfile/history.json";
    private InputReader consoleReader;
    private OutputWriter consoleWriter;
    private CommandDispatcher commandDispatcher;
    private boolean isStarted;

    public EngineImpl(InputReader consoleReader, OutputWriter consoleWriter,
                      CommandDispatcher commandDispatcher) {
        this.consoleWriter = consoleWriter;
        this.consoleReader = consoleReader;
        this.commandDispatcher = commandDispatcher;
    }

    public void start() throws IOException {
        this.isStarted = true;
        JSONArray list = new JSONArray();
        while (this.isStarted) {
            try {
                String userInput = this.consoleReader.readLine();
                String[] args = userInput.split("\\s+");

                String result = this.commandDispatcher.dispatchCommand(args);
                	
                this.consoleWriter.writeLine(result);
                list.add(result);
                if (result.equals(TERMINATE_OUTPUT)) {
                    this.isStarted = false;
                }
            } catch (InvalidUnitTypeException | InvalidPositionException | UnknownCommandException | UnitNotExistException | NotEnoughEnergyException | IOException e) {
                this.consoleWriter.writeLine(e.getMessage());
            }
            

            this.consoleWriter.writeJson(FILE_NAME, list);
        }
    }
}