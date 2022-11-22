package FirstWayToThread;

	//One way of creating Thread
	class Student extends Thread{
		
		@Override
		public void run() {
			for(int i=1;i<=5;i++)
			{
			// for loop is used to change output multiple ways
			
			System.out.println("In side run method "+Thread.currentThread());
			try {
				Thread.sleep(3000); //1sec=1000ms
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
	}
	public class MyThread {

		public static void main(String[] args) throws InterruptedException {
			System.out.println("Main Thread "+Thread.currentThread());
			
			Student ob = new Student();
			//If you want to set the name to our thread use set method
			
			ob.setName("First Thread");
			
			ob.start();
			
			ob.join(); //This method gives the priority to the thread exicution
			
			Student ob1 = new Student();
			
			ob1.setName("Second Thread"); //set the name as per u want
			
			ob1.start();
			//start method difference normal program and threading.
			//If we not use start() it compile and it get output...but as per the normal progrm.
			}

	}
