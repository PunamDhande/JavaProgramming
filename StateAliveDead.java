package Deadlock;
class Myclass implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}


public class StateAliveDead {

	public static void main(String[] args) throws InterruptedException {
		Myclass ob=new Myclass();
		Thread tob=new Thread(ob); //new state
		
		tob.setName("First");
		System.out.println("Is first state Is Alive="+tob.isAlive());
		tob.start();
		System.out.println("Is first state Is Alive="+tob.isAlive());
		tob.join();
		System.out.println("Is first state Is Alive="+tob.isAlive());
		
		Myclass ob1=new Myclass();
		Thread tob1=new Thread(ob1);
		tob.setName("Second");
		System.out.println("Is second state Is Alive="+tob1.isAlive());
		tob1.start();
		System.out.println("Is second state Is Alive="+tob.isAlive());
	}

}
