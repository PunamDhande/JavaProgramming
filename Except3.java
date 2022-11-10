package com.ExceptionHandling;

public class Except3 {

	public static void main(String[] args) {
int a=10,b=0,c=0;
int ar[]=new int[4];
System.out.println("Before Exception");
		System.out.println("Array assignment");
	try {
	c=a/b;
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
	try{
		ar[5]=80;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace(); //catch will excecute only when exception occur 
	}
	System.out.println("Aftyer Division");
	System.out.println("after array assignment");
	}
	

}
