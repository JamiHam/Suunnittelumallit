
public class GraphicsCard implements Component{
	private double price = 419.90;

	public double getPrice() {
		return price;
	}

	public void Add(Component c) {
		throw new RuntimeException("This component can't have children.");
	}
}
