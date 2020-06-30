package runnable;

import java.io.Reader;

public class WaitAndNotifyAll extends Thread {
	Calculator c;

	public WaitAndNotifyAll(Calculator calc) {
		c = calc;
	}

	public void run() {
		synchronized (c) {
			try {
				System.out.println("Waiting for calculation...");
				c.wait();

			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + c.total);
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		new WaitAndNotifyAll(calculator).start();
		new WaitAndNotifyAll(calculator).start();
		new WaitAndNotifyAll(calculator).start();
		new Thread(calculator).start();
	}
}

class Calculator implements Runnable {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notifyAll();
		}
	}
}
