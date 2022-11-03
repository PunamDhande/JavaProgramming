package com.imp_interview;

import java.util.Scanner;

class Calculator{
	float ans;
	public void add(float a,float b) {
		ans=a+b;
		System.out.println("The addition of num "+a+" and "+b+" is "+ans);
	}

public void sub(float a,float b) {
	ans=a-b;
	System.out.println("The substraction of num "+a+" and "+b+" is "+ans);
}
public void mult(float a,float b) {
	ans=a*b;
	System.out.println("The multiplication of num "+a+" and "+b+" is "+ans);


}
public void div(float a,float b) {
	if(b!=0) {
		ans=a/b;
		System.out.println("The division of "+a+" and "+b+" is "+ans);
	}
	else
	{
		System.out.println("The num " +a+ "is not divide by 0");
	}
}
}

public class CalculatorMain {

	public static void main(String[] args) {
int ch;  //choice
char ch1;
Calculator c=new Calculator();
float ans,a,b;
Scanner sc=new Scanner(System.in);
do {
System.out.println("***********Menu***********");
System.out.println("Enter Your Choice");
System.out.println("1.ADDITION");
System.out.println("2.SUBSTRACTION");
System.out.println("3.MULTIPLICATION");
System.out.println("4.DIVISION");
ch=sc.nextInt();
System.out.println("Enter two numbers:");
a=sc.nextFloat();
b=sc.nextFloat();
switch(ch) {
case 1: c.add(a, b);
		break;
case 2: c.sub(a, b);
		break;
case 3: c.mult(a, b);
		break;
case 4: c.div(a, b);
		break;
		
		default:System.out.println("Invalid Input");
}
System.out.println("Do you want to contine y/n");
ch1=sc.next().charAt(0);
}
	while(ch1!='n');
{
		System.out.println("Program is Terminated");
	}

	}
	

}
