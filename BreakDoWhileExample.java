package com.do_while;

public class BreakDoWhileExample {

	public static void main(String[] args) {
int i=1;
do {
	if(i==5) {
		break;
	}
	System.out.println(i);
	i++;
}while(i<=10);
	}
}