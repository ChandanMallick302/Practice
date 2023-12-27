package Multithreading;

interface Runnable{
	public void run();
	public void start();
}
class RunnableDemo implements Runnable{

	private Thread t;
	private String ThreadName;
	public RunnableDemo(String name) {
		this.ThreadName=name;
		System.out.println("Creating "+this.ThreadName);
	}
	@Override
	public void run() {
		System.out.println("Running "+this.ThreadName);
		try {
			for(int i=4; i>0;i--) {
				System.out.println("Thread: "+this.ThreadName+", "+i);
				Thread.sleep(50);
			}
		}catch(InterruptedException ie){
			System.out.println("Thread: "+this.ThreadName+" interrupted.");
		}
		System.out.println("Thread: "+this.ThreadName+" exiting.");
	}
	@Override
	public void start() {
		System.out.println("Starting "+this.ThreadName);
		if(t==null) {
			t=new Thread(this.ThreadName);
		}
	}
	
}
public class Testthread {

	public static void main(String[] args) {
		Runnable obj1=new RunnableDemo("Thread-1");
		Runnable obj2=new RunnableDemo("Thread-2");
		obj1.start();
		obj1.run();
		obj2.start();
		obj2.run();
		
	}

}
