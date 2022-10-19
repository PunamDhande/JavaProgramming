package com.world;

public class Ternary_Operator_Least {

	public static void main(String[] args) {
			int a,b,c,least;
			a=5;
			b=7;
			c=22;
			least=(a<b && a<c)?a:(b<a && b<c)?b:c;
			System.out.println(least);
	}

}
