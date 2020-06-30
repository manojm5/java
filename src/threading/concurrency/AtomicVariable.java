package threading.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {

	private AtomicInteger count = new AtomicInteger(0);

	public void increment() {
		count.incrementAndGet();
	}

	public void decrement() {
		count.decrementAndGet();
	}

	public int value() {
		return count.get();
	}

	public boolean compareAndSetValue(int expected, int updatedValue) {
		boolean isSuccess = count.compareAndSet(expected, updatedValue);
		return isSuccess;

	}

	public static void main(String[] args) {
		AtomicVariable a = new AtomicVariable();
		a.increment();
		System.out.println(a.value());
		boolean isSuccess = a.compareAndSetValue(1, 110);

		System.out.println(isSuccess);

	}
}
