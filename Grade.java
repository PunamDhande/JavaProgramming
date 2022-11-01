package com.program;

import java.util.Scanner;

class Grade {
int marks;
void inputData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks");
	marks=sc.nextInt();	
}
void displayGrade() {
	if(marks>=90 && marks<=100) {
		System.out.println("Grade A");
	}
	else if(marks>=70 && marks<=89) {
		System.out.println("Grade B");
	}
	else if(marks>=40 && marks<=69) {
		System.out.println("Grade C"); 
	}
	else if(marks>=0 && marks<=39) {
		System.out.println("Grade D");
	}
}

public class GradeOfStudent{
	public static void main(String[] args) {
	Grade g=new Grade();
	g.inputData();
	g.displayGrade();

	}
	
}
}
