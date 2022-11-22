package FirstWayToThread;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int num;
		int i;
		int c=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
	

		for(i=1;i<=num;i++) {
			if(num%i==0) {
				c=c+1;
			}
			if(c==2) {
				System.out.println(num+" is a prime number");
			}
			else {
				System.out.println(num+" is not a prime number");
			}
		}
	}

}
