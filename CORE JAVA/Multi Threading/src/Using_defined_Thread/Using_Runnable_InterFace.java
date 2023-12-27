package Using_defined_Thread;

public class Using_Runnable_InterFace implements Runnable {

	// Create Blueprint of thread
	@Override
	public void run() {
		// Give Task
		for (int i = 0; i <= 10; i++) {
			System.out.println("value of i is " + i);
			try {
				Thread.sleep(1000); //Make delay in 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// Create object of thread1
		Using_Runnable_InterFace t1 = new Using_Runnable_InterFace();

		// call the Start() method from the Thread Cladd
		Thread thr = new Thread(t1);
		thr.start();

	}
}
