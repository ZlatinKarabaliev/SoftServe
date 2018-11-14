package net.java.main.interfaces;

import java.io.IOException;

import org.json.simple.JSONArray;

public interface OutputWriter {

  void writeLine(String line) throws IOException;
  void writeJson(String fileName, JSONArray list);
}
