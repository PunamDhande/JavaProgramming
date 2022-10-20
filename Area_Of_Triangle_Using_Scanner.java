package com.Area;

import java.util.Scanner;

public class Area_Of_Triangle_Using_Scanner {

	public static void main(String[] args) {
int base,heigth;
float area;

Scanner sc=new Scanner(System.in);
System.out.println("Enter base=");
base=sc.nextInt(); //user input
System.out.println("Enter heigth");
heigth=sc.nextInt();
area= (0.5f) * base * heigth ;
System.out.println("Ara of Triangle of base= "+base+" and heigth=" +heigth+ " is ="+area);//Display
	}

}
