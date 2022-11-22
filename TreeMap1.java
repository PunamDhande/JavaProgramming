package com.SetAndMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String>tm=new LinkedHashMap<Integer,String>();
		tm.put(1111, "Karjat");
		tm.put(1123,"Kiran");
		tm.put(1124, "Pune");
		tm.put(5334, "hadapsar");
System.out.println(tm);

Set<Entry<Integer,String>>ent=tm.entrySet();

for(Entry<Integer,String>eobj:ent) {
	
	System.out.println(eobj.getKey()+"==>"+eobj.getValue());
}
	}

}
