package com.world;

import java.util.Scanner;

public class Scanner_Eg {

	public static void main(String[] args) {
int age;
float fees;
String name;
String gen;

Scanner sc=new Scanner(System.in);
//user
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter ages");
age=sc.nextInt();
System.out.println("Enter fee");
fees=sc.nextFloat();
System.out.println("Enter gender");
gen=sc.next();
//Display
System.out.println("Name="+name);
System.out.println("Age="+age);
System.out.println("Fee="+fees);
System.out.println("gender="+gen);
	}

}
