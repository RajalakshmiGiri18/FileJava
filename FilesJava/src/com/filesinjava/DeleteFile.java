package com.filesinjava;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File df=new File("C:\\Testfile\\Raji.xlsx");
		if(df.delete())
		{
			System.out.println("Deleted the file "+df.getName());
		}
		else
		{
			System.out.println("Failed to delete the file.");
		}
		

	}

}
