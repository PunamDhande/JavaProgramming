package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FloatListIterator {

	public static void main(String[] args) {
		
		ArrayList<Float> lst=new ArrayList<Float>();
		//Take input from user
		//float val=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the float value");
			float val=sc.nextFloat();
			lst.add(val);
		}
		System.out.println(lst);
		//remove an element
		/* lst.remove(2);
		System.out.println(lst);*/
		//check for contains and contains all
		//contains
		//lst.contains(2.3);
		System.out.println(lst.contains(6.7));
		//lst.containsAll(lst);
		//System.out.println();
		
		//add one list to other list
		ArrayList<Float> lst1=new ArrayList<Float>();
		lst1.add((float) 89.88);
		lst1.add((float)55);
		lst1.add((float)77);
		
		lst.addAll(lst1);
		
		System.out.println(lst);
		Iterator<Float> it=lst.iterator();
		
		while(it.hasNext()) //hasNext it is boolean contain
		{
			System.out.println(it.next()+" ");//need space use ""
		
			
		}
	}

}
