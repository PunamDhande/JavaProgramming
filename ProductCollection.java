package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
/*create a class Product with product id,pname,pprice
 * */
 
class Product{
	int pid;
	String pname;
	float pprice;
	

void inputData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The product id : ");
	pid=sc.nextInt();
	System.out.println("Enter Product name: ");
	pname=sc.next();
	System.out.println("Enetr the product price : ");
	pprice=sc.nextFloat();
	
}


@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
}

}
public class ProductCollection {
public static void main(String[] args) {
LinkedList<Product> plist=new LinkedList<Product>();

Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
Product p4=new Product();

p1.inputData();
p2.inputData();
p3.inputData();
p4.inputData();

plist.add(p1);
plist.add(p2);
plist.add(p3);
plist.add(p4);

System.out.println(plist);

Iterator<Product> it=plist.iterator();
System.out.println("Product id\tProduct name\tProduct pprice");
while(it.hasNext()) {
	Product p=it.next();
	System.out.println(p.pid+"\t\t"+p.pname+"\t\t"+p.pprice);
}


}
}
