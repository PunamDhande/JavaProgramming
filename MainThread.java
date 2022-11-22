package SecondWayToThread;
//by implementing runnable interface
class Myclass1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			
		System.out.println(Thread.currentThread());
	try {
		Thread.sleep(3000);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
		}
		}
	}

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		Myclass1 ob=new Myclass1();
		Thread tob=new Thread(ob);
		tob.setName("First Thread");
		tob.start();
		tob.join();
		Myclass1 ob1=new Myclass1();
		Thread tob1=new Thread(ob1);
		tob1.setName("Second Thread");
		tob1.start();
	}

}
