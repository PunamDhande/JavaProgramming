package com.program;
class AdditonOver{
	void add(int i , int j) {
		int s;
		s=i+j;
		System.out.println("sum of 2 int values "+i+"and"+j+" is "+s);
	}
	void add(float i,float j) {
		float s;
		s=i+j;
		System.out.println("The sum of 2 float values "+i+"and"+j+"is"+s);
	}
	void add(double i,double j) {
		double s;
		s=i+j;
		System.out.println("The sum of 2 double values "+i+" and "+j+" is "+s);
	
}
	void add(short i,short j) {
		short s;
		s=(short)(i+j);
		System.out.println("The sum of 2 short values "+i+" and "+j+" is "+s);
	
}
	void add(long i,long j) {
		long s;
		s=(long)(i+j);
		System.out.println("The sum of 2 long values "+i+" and "+j+" is "+s);
	
}
	void add(byte i,byte j) {
		byte s;
		s=(byte)(i+j);
		System.out.println("The sum of 2 long values "+i+" and "+j+" is "+s);
	
}
}
public class AdditonOverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditonOver ob=new AdditonOver();
		ob.add(2,5);
		ob.add(12.66f, 778.99f);
		ob.add(21.45, 56.5);
		ob.add((short)7,(short)5);
		ob.add(5467L, 31525L);
		ob.add((byte)51, (byte)17);
	}

}

