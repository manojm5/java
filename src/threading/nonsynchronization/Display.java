package threading.nonsynchronization;
public class Display {
	public void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Hello");
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
				
			} catch (InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			System.out.println("Hello "+name);
		}
	}
}
