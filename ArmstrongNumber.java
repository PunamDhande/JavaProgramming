package com.imp_interview;

import java.util.Scanner;

class Armstrong{
	int num,sum,t;
	void inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		t=num;
	}
	void CheckArmstrong() {
		sum=0;
		int d;
		int length=0;
		while(num>0) {
			
			d=num%10;
			sum=sum+d*d*d;
			num=num/10;
		}
		if(t==sum) {
			System.out.println(t+" is Armstrong");
		}
		else {
			System.out.println(t+" is not Armstrong");
		}
	}
}

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Armstrong am=new Armstrong();
am.inputNum();
am.CheckArmstrong();
	}

}
