package Project;

class producer extends Thread {
	Company c;

	public producer(Company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;
		while (true) {
			this.c.produced_item(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			i++;
		}
	}
}

class consumer extends Thread {
	Company c;

	public consumer(Company c) {
		this.c = c;
	}

	public void run() {
		while (true) {
			this.c.consume_item();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class Company {

	private int n;
	boolean f;

	// f=false: chance : producer
	// f:true: chance : consumer

	synchronized public void produced_item(int n) {
		if (f) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		this.n = n;
		System.out.println("Produced " + this.n);
		f = true;
		notify();
	}

	synchronized public int consume_item() {
		if (!f) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Consumed " + this.n);
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f = false;
		return this.n;
	}

	public static void main(String[] args) {
		Company c = new Company();
		producer p1 = new producer(c);
		consumer c1 = new consumer(c);

		p1.start();
		c1.start();
	}
}