package com.pages;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileWriterExample{
	
	@Test
	public void writeOperation() throws IOException{
		
		String fileName = "writenfile.txt";
		String content = "Hello Word !!!";
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter buffWriter = new BufferedWriter(writer);
		buffWriter.write(content);
		buffWriter.close();
		
		
	}
	

}
