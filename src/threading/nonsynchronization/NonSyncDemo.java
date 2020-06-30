package threading.nonsynchronization;

public class NonSyncDemo {
	public static void main(String[] args) {
		Display display = new Display();
		MyThread myThread1 = new MyThread(display, "Hello");
		MyThread myThread2 = new MyThread(display, "People");
		myThread1.setName("Thread1");
		myThread1.setName("Thread2");
		myThread1.start();
		myThread2.start();
	}
}