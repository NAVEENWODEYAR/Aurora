package com.arrora.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile 
{

	private static void readFile()
	{
		// 1. open FileReader,
		try(BufferedReader reader = new BufferedReader(new FileReader("sts")))
		{
			String line;
			// 2. Read line by line,
			while((line=reader.readLine()) !=null)
			{
				try 
				{
					// 3. split the lines,
					String[] values = line.split(",");
					
					// 4. store the values,
					String name = values[0];
					int id = Integer.parseInt(values[1]);
					String mail = values[2];
					double marks = Double.parseDouble(values[3]);
					float res = Float.parseFloat(values[4]);
					String gender = values[5];
					
					// 5. Process the data,
					System.out.println("Student Id:"+id);
					System.out.println("Student Name:"+name);
					System.out.println("Student Mail:"+mail);
					System.out.println("Student Marks:"+marks);
					System.out.println("Student Gender:"+gender);
					System.out.println("Student Result:"+res);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("\n File read successfully,");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n*****File Operations*******");
		readFile();
	}

}
