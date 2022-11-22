package com.java8Featues;

import java.util.ArrayList;
import java.util.Iterator;

public class listIteratorUsingLambda {

	public static void main(String[] args) {
ArrayList<Integer>lst=new ArrayList<Integer>();
 for(int i=1;i<=10;i++) {
	 lst.add(i);
 }
 
 Iterator<Integer> it=lst.iterator();
 while(it.hasNext()) {
	 System.out.println(it.next());
 }
 
 //another way is USING LAMBDA METHOD
 
 lst.forEach(x->System.out.println(x+""));
	}

}
