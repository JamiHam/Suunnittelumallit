
public class Main {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Clock clock = new Clock(timer);
		
		new Thread(timer).start();
	}
}
