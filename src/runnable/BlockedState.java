package runnable;

public class BlockedState {
	public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new DemoThreadB());
        Thread t2 = new Thread(new DemoThreadB());
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        
        t2.start();
        Thread.sleep(1000);
         
        System.out.println("t1:"+t1.getState()+"\tt2:"+t2.getState());
        System.exit(0);
    }
}
 
class DemoThreadB implements Runnable {
    @Override
    public void run() {
        commonResource();
    }
     
    public static synchronized void commonResource() {
        while(true) {
            //Some code
        }
    }
}