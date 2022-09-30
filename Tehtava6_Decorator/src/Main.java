
public class Main {

	public static void main(String[] args) {
		//IData data = new Data();
		IData data = new PasswordDecorator(new Data());
		
		data.selectAction();
	}
}
