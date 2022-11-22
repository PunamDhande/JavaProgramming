package com.SetAndMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainHashSet {

	public static void main(String[] args) {
		Set<Integer> hob=new HashSet<Integer>();
		hob.add(90);
		hob.add(null);
		hob.add(65);
		hob.add(90);
		hob.add(65);
		System.out.println(hob);
		
		
		//If we want to Removing duplicate elements from ArrayList, vector,...we need to creat object.
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist.add(50);
		alist.add(18);
		alist.add(18);
		alist.add(null);
		alist.add(50);
	System.out.println(alist);
		
		Set<Integer> l1=new HashSet<Integer>(alist);
		System.out.println("after removing duplicate elements = "+l1);
		
	}

}
