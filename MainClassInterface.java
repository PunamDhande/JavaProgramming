package com.edu;

class ParentClass{
	int i,j;
	ParentClass(int i,int j)//uses same variable like instance variable so we use this class
	{
		System.out.println("Parent class constructor");
		this.i=i;
		this.j=j;
	}
}
class ChildClass extends ParentClass {//single Inheritance
int s;

ChildClass(int i,int j){
	super(i,j);
	System.out.println("Child class constructor");
}
void add() {
	s=i+j;
	System.out.println("sum="+s);
}

}
public class MainClassInterface {
public static void main(String args[]) {
	
	ChildClass ob=new ChildClass(8,9 );
	ob.add();
}
}
