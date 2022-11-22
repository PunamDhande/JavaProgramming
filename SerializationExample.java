package com.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student{
	int rollno;
	String name;
	String dept;
	
}

public class SerializationExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("st.txt");
		PrintStream ps=new PrintStream(fo);
		Student sob=new Student();
		sob.rollno=111;
		sob.name="Punam";
		sob.dept="BCS";
		ps.print(sob.rollno);
		ps.print(sob.name);
		ps.print(sob.dept);
		
		fo.close();
		ps.close();
		System.out.println("Student object is written to the file");
	}

}
