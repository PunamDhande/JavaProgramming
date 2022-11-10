package com.ExceptionHandling;

public class DivideByZeroMain {

	public static void main(String[] args) {
int a=10,b=0, c=0;

System.out.println("Before Division");
try {
c=a/b;
}
catch(Exception e) {
	e.printStackTrace();
}
System.out.println("After Division:"+c);
}
	}

