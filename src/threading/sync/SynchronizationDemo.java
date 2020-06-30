package threading.sync;
public class SynchronizationDemo {
	public static void main(String[] args) {
		Display display = new Display();
		MyThread myThread1 = new MyThread(display, "Dhoni");
		MyThread myThread2 = new MyThread(display, "Kohli");
		myThread1.setName("Thread1:");
		myThread1.setName("Thread2:");
		myThread1.start();
		myThread2.start();
	}
}