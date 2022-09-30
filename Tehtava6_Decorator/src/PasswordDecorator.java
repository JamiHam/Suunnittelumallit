import java.util.Scanner;

public class PasswordDecorator extends DataDecorator{
	private Scanner scanner = new Scanner(System.in);
	private String password = "password123";

	public PasswordDecorator(IData dataToBeDecorated) {
		super(dataToBeDecorated);
	}
	
	@Override
	public void selectAction() {
		System.out.println("Enter password: ");
		if (scanner.next().equals(password)) {
			super.selectAction();
		} else {
			System.out.println("Access denied");
		}
	}
}
