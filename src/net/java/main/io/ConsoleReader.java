package net.java.main.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.java.main.interfaces.InputReader;

public class ConsoleReader implements InputReader {

	private BufferedReader reader;
	
	public ConsoleReader () {
		this.reader = new BufferedReader(new InputStreamReader(System .in) );
	}
	
	
	
	
	
	@Override
	public String readLine() throws IOException {
		return reader.readLine() ;
	}
}
