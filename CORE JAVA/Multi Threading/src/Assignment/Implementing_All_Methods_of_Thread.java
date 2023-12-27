package Assignment;

class UserThread extends Thread{
	public void run() {
		//task for thread
		System.out.println("This is user defind thread");
	}
}
public class Implementing_All_Methods_of_Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Started");
		int x = 56 + 34;
		System.out.println("Sum is " + x);
		// get the current thread name
		String name = Thread.currentThread().getName();
		System.out.println("Current thread name is: " + name);

		// set the current thread name
		Thread.currentThread().setName("Chandan");
		System.out.println("After setting Current thread name is " + Thread.currentThread().getName());

		// Create delay for 5 sec of execution
		Thread.sleep(5000);
		
		//get the thread id
		System.out.println(Thread.currentThread().getId());
		
		//Going to start user-defined thread
		//after execution of first thread it will going execute
		//so it is now scheduled in queue by thread-scheduler
		UserThread thread=new UserThread();
		thread.start();
		
		System.out.println("Program Ended");
	}
}
