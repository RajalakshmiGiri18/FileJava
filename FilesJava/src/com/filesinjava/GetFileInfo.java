package com.filesinjava;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inf=new File("C://TestFile//test check.txt");
		if(inf.exists())
		{
			System.out.println("File name: "+inf.getName());
			System.out.println("Absolute path: "+inf.getAbsolutePath());
			System.out.println("Writable: "+inf.canWrite());
			System.out.println("Readable: "+inf.canRead());
			System.out.println("File size in bytes: "+inf.length());
			
			
		}
		else {
			System.out.println("The file does not exist.");
		}

	}

}
