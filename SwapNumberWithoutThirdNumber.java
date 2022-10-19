package basic_to_advance;

public class SwapNumberWithoutThirdNumber {

	public static void main(String[] args) {
		int a,b;//Declaration
		a=20;//Initialisation
		b=40;
		System.out.println("Before swapping a="+a+ "and b="+b);//display
		a=a+b; //a=20+40=60//Calculation
		b=a-b; //b=60-40=20
		a=a-b; //a=60-20=40
		System.out.println("After swapping a="+a+ "and b="+b);

	}

}
