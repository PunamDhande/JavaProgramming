package com.imp_interview;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
int t,f1=1,f2=1,f3,n=1;

Scanner sc=new Scanner(System.in);
System.out.println("Enter The Terms:");
t=sc.nextInt();
System.out.println("Fibonocci Series:");
System.out.println(f1);
System.out.println(f2);

while(n<=t-2) {
	f3=f1+f2;
	System.out.println(f3);
	f1=f2;
	f2=f3;
	n=n+1;
}
	}

}
