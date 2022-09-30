import java.util.ArrayList;
import java.util.Scanner;

public class Data implements IData{
	private ArrayList<String> data = new ArrayList<String>();
	private Scanner scanner = new Scanner(System.in);
	private boolean running;
	
	public void selectAction() {
		running = true;
		while (running) {
			System.out.println("\nSelect action:\n"
				+ "1: Print data\n"
				+ "2: Add data\n"
				+ "3: Exit");
			
			int selection = scanner.nextInt();
				
			switch (selection) {
				case 1:
					printData();
					break;
				case 2:
					addData();
					break;
				case 3:
					running = false;
					break;
			}
		}
	}

	@Override
	public void printData() {
		System.out.println("List of data:");
		for (String string : data) {
			System.out.println(string);
		}
	}

	@Override
	public void addData() {
		System.out.println("Enter data: ");
		data.add(scanner.next());
	}
}
