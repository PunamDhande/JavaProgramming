package com.world;

import java.util.Scanner;

public class Switch_MainApp {

	public static void main(String[] args) {
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day Number");
		day=sc.nextInt();
		sc.close();
		switch(day) {
		case 1:System.out.println("Monday:First day of week");
				break;
		case 2:System.out.println("Tuesday:Second day of week");
		break;
		case 3:System.out.println("Wednesday:Third day of week");
		break;
		case 4:System.out.println("Thursday:Fourth day of week");
		break;
		case 5:System.out.println("Friday:Fifth day of week");
		break;
		case 6:System.out.println("Saturday:Sixth day of week");
		break;
		case 7:System.out.println("Saturday:Seventh day of week");
		break;
		default:System.out.println("You entered Invalid data");
			}

		
	}

}
