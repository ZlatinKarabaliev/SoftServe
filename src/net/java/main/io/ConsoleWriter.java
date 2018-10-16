package net.java.main.io;

import java.io.IOException;

import net.java.main.interfaces.OutputWriter;

public  class ConsoleWriter implements OutputWriter {

	@Override
	public void writeLine(String line) throws IOException {
		System.out.println(line);
		
	}

	

}
