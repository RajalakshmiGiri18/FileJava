package com.filesinjava;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		try {
			FileWriter fw=new FileWriter("C:\\TestFile\\test check.txt");
			fw.write("Hello  tester");
			fw.close();
			System.out.println("Successfully wrote to the file");
		} catch(IOException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}

}
