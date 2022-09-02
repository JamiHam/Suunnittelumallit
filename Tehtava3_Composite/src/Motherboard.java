import java.util.ArrayList;
import java.util.List;

public class Motherboard implements Component {
	private double price = 149.90;
	private List<Component> components = new ArrayList<Component>();

	public double getPrice() {
		double totalPrice = price;
		for (Component c : components) {
			totalPrice += c.getPrice();
		}
		return totalPrice;
	}

	public void Add(Component c) {
		components.add(c);
	}
}
