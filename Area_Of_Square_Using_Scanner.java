package com.Area;

import java.util.Scanner;

public class Area_Of_Square_Using_Scanner {

	public static void main(String[] args) {
int side,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of square::");
side=sc.nextInt();
area=side* side;
System.out.println("Area of Square with side:"+side+"is="+area);
	}

}
