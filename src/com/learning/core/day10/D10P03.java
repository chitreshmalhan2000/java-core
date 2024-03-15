package com.learning.core.day10;
import java.util.*;
import java.io.*;
public class D10P03 {

	public static void main(String[] args) {
		try {
		FileInputStream fin=new FileInputStream("src/com/learning/core/day10/NewSer.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Studentclass o1=(Studentclass)oin.readObject();
		System.out.println(o1.getName()+" "+o1.getAge()+" "+o1.getRollNumber()+" "+o1.getAddress());
		Studentclass o2=(Studentclass)oin.readObject();
		System.out.println(o2.getName()+" "+o2.getAge()+" "+o2.getRollNumber()+" "+o2.getAddress());
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}