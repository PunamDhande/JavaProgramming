package p5;

import p6.ParentClass;

class ChildClass extends ParentClass{//single iheritance
int s;
ChildClass(int i,int j){
	super(i,j);
	System.out.println("Child Constructor");
}
void add() {
	s=i+j;
	System.out.println("sum="+s);
}
}

public class MainClass {

	public static void main(String[] args) {
ChildClass ob=new ChildClass(8,9);
ob.add();
ParentClass pob=new ParentClass(9,8);
System.out.println("Protected data="+pob.k);
	}

}
