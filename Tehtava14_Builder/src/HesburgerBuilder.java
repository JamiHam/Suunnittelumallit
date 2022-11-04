
public class HesburgerBuilder implements IBurgerBuilder {
	private Hesburger burger;
	
	public void createBurger() {
		burger = new Hesburger();
	}
	
	public void buildBun() {
		burger.addIngredient(new Bun());
	}
	
	public void buildSauce() {
		burger.addIngredient(new Sauce());
	}
	
	public void buildPatty() {
		burger.addIngredient(new Patty());
	}
	
	public void buildSalad() {
		burger.addIngredient(new Salad());
	}
	
	public Hesburger getBurger() {
		return burger;
	}
}
