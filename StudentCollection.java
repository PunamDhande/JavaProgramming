package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
		int sid;
		String sname;
		float sfees;
		public Student(int sid, String sname, float sfees) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.sfees = sfees;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
		}
		
		
	}
public class StudentCollection {

	public static void main(String[] args) {
		ArrayList<Student> slist=new ArrayList<Student>();
		Student s1=new Student(1,"Punam",25439.074f);
		Student s2=new Student(2,"Shrushthi",10439.074f);
		Student s3=new Student(3,"Rahul",65999.074f);
		Student s4=new Student(4,"Pradnya",55439.074f);
		
		//add student object to list
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);

	System.out.println(slist);
	System.out.println("******************************");
	
	//use iterator for displaying
	
	Iterator<Student> st=slist.iterator();
	
	System.out.println("SID\tSNAME\tSFEES");
	while(st.hasNext()) {
		Student sob=st.next();
		System.out.println(sob.sid+"\t"+sob.sname+"\t"+sob.sfees);
	}
	
	
	}

}
