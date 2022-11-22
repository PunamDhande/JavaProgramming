package com.java8Featues;

@FunctionalInterface
interface Additn{
	void add(int a,int b);
}

@FunctionalInterface
interface Multiplication{
	int mult(int a,int b);
}
public class Addition {

	public static void main(String[] args) {
		Additn aob=(int a,int b)->{
			int s=a+b;
			System.out.println("The sum is "+s);
		};
		aob.add(6,7);
	}

	
	Multiplication mob=( a, b)->{
		int p;
	   p=a*b;
		return p;

	};
	System.out.println("The multiplication is "+mob.mult(5,9));
	
}
