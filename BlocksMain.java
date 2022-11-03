package com.classobject;

public class BlocksMain {
static {
	System.out.println("This is a Static block");
}
{
	System.out.println("This is an Ananomous block");
}
BlocksMain(){
	System.out.println("This is an Construction block");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("This is a main block");
BlocksMain ob=new BlocksMain();

	}

}
