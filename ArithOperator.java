package basic_to_advance;

public class ArithOperator {

	public static void main(String[] args) {
		float num1,num2,ans;
        num1=34.2F;
        num2=12.2F;
        
        //addition(+)
        ans=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+ans);
        
        //diff(-)
        ans=num1-num2;
        System.out.println("The difference of "+num1+" and "+num2+" is "+ans);
	   
         //product(*)
        ans=num1*num2;
        System.out.println("The product of "+num1+" and "+num2+" is "+ans);
        
        //Quotient(/) 
        ans=num1/num2;
        System.out.println("The quotient of "+num1+" and "+num2+" is "+ans);
	
        //Remainder(%) 
	    ans=num1%num2; 
	    System.out.println("Remainder of "+num1+" and "+num2+" is "+ans);
	}

}
