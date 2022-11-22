package com.java8Featues;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

	public static void main(String[] args) {
ArrayList<String>lst=new ArrayList<String>();

	 lst.add("Punam");
	 lst.add("Dhande");
	 lst.add("Mukta");
 
 Iterator<String> it=lst.iterator();
 while(it.hasNext()) {
	 System.out.println(it.next());
 }
 
 //another way is USING LAMBDA METHOD
 
 lst.forEach(x->System.out.println(x+""));
	}

}

