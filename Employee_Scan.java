package com.Area;

import java.util.Scanner;

public class Employee_Scan {

	public static void main(String[] args) {
//Variable declaration
String name;
int eage;
float emonsal;
String edept;
double eyearsal;
Scanner sc=new Scanner(System.in);

//Display
System.out.println("Enter Employee name=");
name=sc.next();
System.out.println("Enter Employee age=");
eage=sc.nextInt();
System.out.println("Enter Employee month salary=");
emonsal=sc.nextFloat();
System.out.println("Enter Employee department=");
edept=sc.next();

eyearsal=(12)*emonsal;
System.out.println("Employee one year salary is = "+eyearsal);

	}

}
