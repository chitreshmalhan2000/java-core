package com.learning.core.day10;
import java.util.*;
import java.io.*;
public class D10P04 {

	public static void main(String[] args) {
		try {
			File sourcefile=new File("src/com/learning/core/day10/sourcefile.txt");
			File dfile=new File("src/com/learning/core/day10/dfile.txt");
			FileInputStream sf=new FileInputStream(sourcefile);
			FileOutputStream df=new FileOutputStream(dfile);
			int c;
			while((c=sf.read())!=-1)
			{
				df.write(c);
				df.flush();
			}
			sf.close();
			df.close();
			  }
			catch(Exception e) {
				e.printStackTrace();
			}

	}}

