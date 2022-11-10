package com.patterns;

public class PatternNumSpace {

	public static void main(String[] args) {
		
				int k=1;
				for(int i=1;i<=4;i++)
				{
					for(int b=4-i;b>1;b--)
					{
						System.out.print("");
					}
					for(int j=1;j<=i+1;j++)
					{
						System.out.print(k++ +" ");
					}
					System.out.println();
				}
	}
}
