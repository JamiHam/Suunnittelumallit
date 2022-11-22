import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		IteratorThread thread1 = new IteratorThread(list, "Thread 1");
		
		thread1.start();
	}
}
