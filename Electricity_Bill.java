package com.assignment;

import java.util.Scanner;
class Electricity_Bill {

int consumer_no;
String name;
double amount;
	float P1,P2;
	double UC;
	
	void inputDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter consumer no: ");
	consumer_no=sc.nextInt();
	System.out.println("Enter consumer name: ");
	name=sc.next();
	System.out.println("Enter Previous Reading:");
	int P1=sc.nextInt();
	System.out.println("Enter Present Reading:");
	int P2=sc.nextInt();
	UC=P2-P1;
	sc.close();
	}
	
	void calculation() {
	if(UC<=100) {
		amount=1.25*UC;
		System.out.println("Consumer No.   Name    Unit Consumed        Amount");
		System.out.println(" "+consumer_no+"           "+name+"        "+UC+"             "+amount);
	}
	else if(UC>100 && UC<=200) {
			amount=1.50*UC;
			System.out.println(" "+consumer_no+"           "+name+"        "+UC+"             "+amount);
	}
	else {
		amount=1.80*UC;
		System.out.println(" "+consumer_no+"           "+name+"        "+UC+"             "+amount);

	}
	}
	/*void display() {
		System.out.println("Consumer No.   Name    Unit Consumed    Amount");
		System.out.println(" "+consumer_no+"           "+name+"        "+UC+"             "+amount);
	}*/
	public class EBillMain{

	public static void main(String[] args) {
		Electricity_Bill obj=new Electricity_Bill();
	
		obj.inputDetails();
		obj.calculation();
	
	}
	}

}