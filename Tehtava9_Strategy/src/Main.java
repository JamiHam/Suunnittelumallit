import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		ListConverter converter1 = new OnePerRowConverter();
		ListConverter converter2 = new TwoPerRowConverter();
		ListConverter converter3 = new ThreePerRowConverter();
		
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		System.out.println(converter1.listToString(list));
		System.out.println(converter2.listToString(list));
		System.out.println(converter3.listToString(list));
	}
}
