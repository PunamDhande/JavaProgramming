package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class StringListElement {

	public static void main(String[] args) {
 ArrayList<String> lst=new ArrayList<String>();
	lst.add("Punam");
	lst.add("Gorakh");
	lst.add("Dhande");
	lst.add("bachelor");
	lst.add("Divya");
	
	System.out.println(lst);
	//using for loop...........
	for(String n:lst) {
		System.out.println(n);
	}
	//Try with iterator
	Iterator<String>it=lst.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	//declare another list
	
	}

}
