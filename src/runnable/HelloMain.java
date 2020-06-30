package runnable;

public class HelloMain {

	public static void main(String[] args) {
		
//Instantiate the Runnable Class and pass it to the Thread
	    HelloRunnable hello = new HelloRunnable();
		Thread helloThread = new Thread(hello);
		helloThread.start();
		//helloThread.start(); 
		System.out.println(helloThread.getState());
		System.out.println("---:"+Thread.currentThread().getName());
	
	}

}
