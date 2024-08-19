package com.filesinjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File rf=new File("C:\\TestFile\\test check.txt");
			Scanner s=new Scanner(rf);
			while(s.hasNextLine())
			{
				String data = s.nextLine();
				System.out.println(data);
			}
			s.close();
		} 
		catch(FileNotFoundException e){
			System.out.println("Error occurred.File not found");
			e.printStackTrace();
		}
		{
			
		}

	}

}
