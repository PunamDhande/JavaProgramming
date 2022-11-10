package com.ExceptionHandling;

public class ArrayException {

	public static void main(String[] args) {
int a[]=new int[4];

System.out.println("Before array assign values:");
	try {
a[0]=10;
a[1]=4;
a[2]=67;
a[3]=77;
a[4]=66;
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	System.out.println("After array value assign");
}
	

}
