import java.util.ArrayList;
import java.util.List;

public class Hesburger {
	ArrayList<Object> burger;
	
	public Hesburger() {
		burger = new ArrayList<Object>();
	}
	
	public void addIngredient(Object ingredient) {
		burger.add(ingredient);
	}
	
	public String toString() {
		String burgerString = "";
		for (Object ingredient : burger) {
			burgerString += ingredient;
			burgerString += "\n";
		}
		return burgerString;
	}
}
