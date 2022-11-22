package com.edu;
//interface is blue print for class
interface MyIntFace1{
	int i=9; //It is bydefault public static final int i=9;
	void m1(); //It is bydefault public abstract void m1();
	void m2(); //public abstract void m2();
	}
class Product implements MyIntFace1{

	@Override
	public void m1() {
System.out.println("m1()");		
	}

	@Override
	public void m2() {
System.out.println("m2()");		
	}
	
}
public class MainAppInterface {

	public static void main(String[] args) {
Product pob=new Product();
pob.m1();
pob.m2();
	}

}

