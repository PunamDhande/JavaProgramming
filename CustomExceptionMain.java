package com.ExceptionHandling;

class PersonAge extends Exception{ //here PersonAge class behaves like Arithmetic
	public PersonAge(String s) {
		super(s);
	}
}
class Vote{
	void checkAge(int a) {
		try {
			if(a<18) throw new PersonAge("Age less than not eligible for vote");
		}catch(PersonAge e) {
			e.printStackTrace();
		}
	}
}

public class CustomExceptionMain {

	public static void main(String[] args) {
		Vote vob=new Vote();
		vob.checkAge(15);
		

	}

}
