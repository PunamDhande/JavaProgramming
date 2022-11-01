package com.imp_interview;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
int num;
int i;
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
for(i=1;i<=num;i++) {
	if(num%i==0) {
		c=c+1;
	}
}
if(c==2) {
System.out.println(num+ "is prime number");	
}
else
{
	System.out.println(num+"is not prime number");
}
}
}