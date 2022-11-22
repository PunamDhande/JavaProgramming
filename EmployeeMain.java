package com.SetAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int eid;
	String ename;
	int eage;
	public Employee(int eid, String ename, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}

}
//Sorting user defined datatypes age
class SortAge implements Comparator<Employee>{

	@Override
	public int compare(Employee eob1, Employee eob2) {
		if (eob1.eage<eob2.eage)
		return -1;
		else if(eob1.eage>eob2.eage)
			return 1;
		else
		return 0;
	}
	
}

//Sorting user defined datatypes id
class SortId implements Comparator<Employee>{

	@Override
	public int compare(Employee eob1, Employee eob2) {
		if (eob1.eage<eob2.eage)
		return -1;
		else if(eob1.eage>eob2.eage)
			return 1;
		else
		return 0;
	}
	
}

//Sorting user defined datatypes name
class Sortname implements Comparator<Employee>{

	@Override
	public int compare(Employee eob1, Employee eob2) {
		return eob1.ename.compareTo(eob2.ename);
	}
	
}



public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Employee> elist=new ArrayList<Employee>();
			
			Employee e1=new Employee(1, "Zeeba", 22);
			Employee e2=new Employee(2, "Poovi", 25);
			Employee e3=new Employee(6, "Gokul", 21);
			Employee e4=new Employee(5, "Praveen",20);
			
			elist.add(e1);
			elist.add(e2);
			elist.add(e3);
			elist.add(e4);
			
			System.out.println(elist);
			//sort by age
			SortAge eage=new SortAge();
			Collections.sort(elist,eage);
			System.out.println("After sorting");
			
			System.out.println(elist);
			
			//sort by id
			
			SortId eid=new SortId();
			Collections.sort(elist,eid);
			System.out.println("After sorting");
			System.out.println(elist);
			
			//sort by name
			
			SortId ename=new SortId();
			Collections.sort(elist,ename);
			
			System.out.println("Sorting based on name");
			

			Iterator<Employee> it1=elist.iterator();
			
			while(it1.hasNext()) {
				Employee eobj=it1.next();
				
				System.out.println(eobj.eid+"\t"+eobj.ename+"\t"+eobj.eage);
			}
		
	}

}
