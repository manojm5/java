package runnable;


	public class WaitingState implements Runnable {
	    public static Thread t1;
	 
	    public static void main(String[] args) {
	        t1 = new Thread(new WaitingState());
	        t1.start();
	    }
	 
	    public void run() {
	        Thread t2 = new Thread(new DemoThreadWS());
	        t2.start();
	 
	        try {
	            t2.join();
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            System.out.println("Thread interrupted:"+ e);
	        }
	    }
	}
	 
	class DemoThreadWS implements Runnable {
	    public void run() {
	        try {
	            Thread.sleep(1000);
	            System.out.println("Inside run");
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            System.out.println("Thread interrupted"+e);
	        }
	         
	        System.out.println(WaitingState.t1.getState());
	   
	}
}
