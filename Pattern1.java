package com.patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
int r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number Of row:");
r=sc.nextInt();

for(int i=1;i<=r;i++) {
	for(int b=r-i;b>1;b--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
	}
	System.out.println();
}

	}

}
