
public class McDonalds {
	private StringBuilder burger = new StringBuilder();
	
	public void addIngredient(String ingredient) {
		burger.append(ingredient);
		burger.append("\n");
	}
	
	public String toString() {
		return burger.toString();
	}
}
