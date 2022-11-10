package com.ExceptionHandling;

import java.util.Scanner;

class Bank extends Exception{
	public Bank(String s){
		super(s);
	}
}
class BankBalance{
	private int balance;
	public BankBalance()
	{
		balance=10000;
	}
	public void withdraw(int amount) {
	
		try{
		if(amount>balance) throw new Bank("Your balance is low");
	}catch(Bank e) 
	{
		e.printStackTrace();
	}
		if(amount<balance)
		{
			System.out.println("debited Amount");
			System.out.println("Rs."+amount+"/-");
			System.out.println();
			System.out.println();
			int avail=balance-amount;
			System.out.println("Your available balance is Rs."+avail);
			System.out.println();
			System.out.println();
			System.out.println("Transaction Completed Successfully.");
			System.out.println();
			System.out.println();
			System.out.println("Thank You");
			System.out.println();
			System.out.println("Visit again");
			
			
		}
		else
		{
			System.out.println("Transaction Failed");
		}
}
}
public class CustomExceptionBalance {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("*** Available only 500's, 2000's ***");
System.out.println("Enter Your Withdraw Amount");
int a=sc.nextInt();
BankBalance bb=new BankBalance();
bb.withdraw(a);
	}

}
