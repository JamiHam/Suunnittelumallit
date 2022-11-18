
public class Main {

	public static void main(String[] args) {
		Clock clock1 = new Clock();
		Clock clock2 = (Clock) clock1.clone();
		
		clock1.setTime(1, 2);
		System.out.println("Clock 1:\n" + clock1);
		System.out.println("Clock 2:\n" + clock2);
		
		
		clock2.setTime(3, 4);
		System.out.println("Clock 1:\n" + clock1);
		System.out.println("Clock 2:\n" + clock2);
		
		clock1.setTime(5, 6);
		System.out.println("Clock 1:\n" + clock1);
		System.out.println("Clock 2:\n" + clock2);
	}
}
