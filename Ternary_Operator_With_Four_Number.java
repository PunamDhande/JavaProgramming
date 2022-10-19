package com.world;

public class Ternary_Operator_With_Four_Number {

	public static void main(String[] args) {
			int a,b,c,d,largest;
			a=5;
			b=7;
			c=22;
			d=66 ;
			largest=(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;
			System.out.println(largest);
	}

}
