package Using_defined_Thread;

public class Using_Thread_Class extends Thread {
	public void run() {
		// Task for thread
		for (int i = 10; i >= 1; i--) {
			System.out.println("Another Thread is " + i);
			try {
				Thread.sleep(1000);// Create 1Sec delay
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		Using_Thread_Class t1 = new Using_Thread_Class();
		t1.start();

	}

}
