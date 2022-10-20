package com.Area;

import java.util.Scanner;

public class Area_Of_Rectangle_Using_Scanner {

	public static void main(String[] args) {
int length,breadth,area;

Scanner sc=new Scanner(System.in);
//User Input
System.out.println("Enter length=");
length=sc.nextInt();
System.out.println("Enter breadth=");
breadth=sc.nextInt();
area = length*breadth;
System.out.println("Area of Rectangle of length="+length+" and breadth="+breadth+ " is =");
	}

}
