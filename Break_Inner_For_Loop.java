package com.ForLoop;

public class Break_Inner_For_Loop {

	public static void main(String[] args) {
		//Outer loop
for(int i=1;i<=3;i++) {
	for(int j=1;j<=3;j++) {
		if(i==3 && j==3)
		{
			break;
		}
		System.out.println(i+" "+j);
	}
}
	}

}
