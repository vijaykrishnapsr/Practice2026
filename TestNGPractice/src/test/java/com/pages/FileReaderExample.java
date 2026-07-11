package com.pages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileReaderExample {

	@Test
	public void readOperation() throws IOException {

		String fileLocation = "writenfile.txt";
		FileReader reader = new FileReader(fileLocation);
		BufferedReader buffReader = new BufferedReader(reader);
		String content;
		while ((content=buffReader.readLine())!= null) {
			System.out.println(content);
		}
		buffReader.close();
	}

}
