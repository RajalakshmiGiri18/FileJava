package com.filesinjava;

import java.io.File;
import java.io.IOException;

public class CreateFileDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		File cf=new File("C:\\Testfile\\Raji.xlsx");
		if(cf.createNewFile())
		{
			System.out.println("File created: "+cf.getName());
			System.out.println("Absolute path: "+cf.getAbsolutePath());
		} else {
			System.out.println("File already exists");
		}
	}
	catch(IOException e)
	{
		System.out.println("An error occurred");
		e.printStackTrace();
		
	}

	}

}
