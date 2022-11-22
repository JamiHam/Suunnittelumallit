import java.util.ArrayList;
import java.util.Iterator;

public class IteratorThread extends Thread {
	String name;
	private ArrayList<Integer> list;
	Iterator<Integer> iterator;
	
	public IteratorThread(ArrayList<Integer> list, String name) {
		this.name = name;
		this.list = list;
		this.iterator = list.iterator();
	}
	
	public void run() {
		while (iterator.hasNext()) {
			System.out.println(name + ": " + iterator.next());
			iterator.remove();
		}
		
		System.out.println(list);
	}
}
