package com.patterns;

import java.util.Scanner;

public class PatternReverse {

	public static void main(String[] args) {
int r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number Of row:");
r=sc.nextInt();

for(int i=r;i>=1;i--) {
	for(int b=1;b<=r-i;b++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
	}
	System.out.println();
}

	}

}
