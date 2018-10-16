package net.java.main;

import java.io.IOException;

import net.java.main.core.EngineImpl;
import net.java.main.dispachers.CommandDispatcher;

import net.java.main.interfaces.InputReader;
import net.java.main.interfaces.OutputWriter;
import net.java.main.io.ConsoleReader;
import net.java.main.io.ConsoleWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        OutputWriter writer = new ConsoleWriter();
        InputReader reader = new ConsoleReader();
        
        CommandDispatcher commandDispatcher = new CommandDispatcher();

        EngineImpl gameEngine = new EngineImpl(writer,reader, commandDispatcher);
        gameEngine.start();
    }
}
