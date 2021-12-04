package day29exceptionsIterators;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//How to read a text file line by line

public class Exception03BufferedReader {

	public static void main(String[] args) {
		readTextFileLineByLine();

	}
	
	public static void readTextFileLineByLine() {
		/*
		FileReader reader;
		
		try {
			reader = new FileReader("src/day28exceptions/TestFile01");		
		
			BufferedReader br = new BufferedReader(reader);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new FileReader("src/day28exceptions/TestFile01"));
			
			String line = br.readLine();
			
			while(line != null) {
			
				System.out.println(line);
				
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Path is wrong or the file does not exist");
		} catch (IOException e) {
			System.out.println("For some reason the file cannot be read");
		}finally {
			try {
				br.close();
			} catch (IOException e) {				
				System.out.println("For some reason, the file could not be closed");
			}catch (NullPointerException e) {				
				System.out.println("You can not close non-existing file");
			}
		}
		
	}

}
