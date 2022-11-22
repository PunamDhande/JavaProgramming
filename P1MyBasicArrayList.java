package ArrayList;

import java.util.ArrayList;

public class P1MyBasicArrayList {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("JAVA");
		
		alist.add("Python");

		alist.add("C");

		alist.add("DS");

		alist.add("HTML");
		
	System.out.println(alist);
	
	//get elements by id
	System.out.println("Element at index 1:" +alist.get(1));
	System.out.println("Does list contains JAVA?" +alist.contains("JAVA"));
	
	//Add elements at a specific index
	alist.add(2,"MYSQL");
	
	System.out.println(alist);
	System.out.println("Is arraylist empty? "+alist.isEmpty());
	System.out.println("Index of HTML is  " +alist.indexOf("HTML"));
	System.out.println("Size of arraylist is:  "+alist.size());
	

		
	}

}
