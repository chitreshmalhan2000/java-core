package com.learning.core.day10;
import java.util.*;
import java.io.*;
public class D10P01 {

	public static void main(String[] args) {
		
		try {
		File sourcefile=new File("src/com/learning/core/day10/sourcefile.txt");
		    sourcefile.createNewFile();
		    if(sourcefile.exists())
		  {
		File destinationfile=new File("src/com/learning/core/day10/destinationfile.txt");
		if (!destinationfile.exists())
		{
			destinationfile.createNewFile();
		
		}
			System.out.println("whether you want to overwrite? (Yes/No)");
			String s;
			Scanner sc=new Scanner(System.in);
			s=sc.next();
			if(s.equals("Yes")) {
		FileInputStream sf=new FileInputStream(sourcefile);
		FileOutputStream df=new FileOutputStream(destinationfile);
		int c;
		while((c=sf.read())!=-1)
		{
			df.write(c);
			df.flush();
		}
		sf.close();
		df.close();
		}
		else
			System.out.println("file is not overwritten");

	}
		  else
			System.out.println("Source file is not exists");  
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

}}
