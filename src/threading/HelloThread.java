package threading;

/*The limitation with this approach (besides being a poor design choice in most
cases) is that if you extend Thread, you can't extend anything else. 
*/
public class HelloThread extends Thread {

	public void run() {
		System.out.println("Hello ..  Welcome to Capgemini.");
	}

}
