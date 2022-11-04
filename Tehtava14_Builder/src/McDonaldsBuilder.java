
public class McDonaldsBuilder implements IBurgerBuilder{
	private McDonalds burger;
	
	public void createBurger() {
		burger = new McDonalds();
	}
	
	public void buildBun() {
		burger.addIngredient("McDonalds Bun");
	}
	
	public void buildSauce() {
		burger.addIngredient("McDonalds Sauce");
	}
	
	public void buildPatty() {
		burger.addIngredient("McDonalds Patty");
	}
	
	public void buildSalad() {
		burger.addIngredient("McDonalds Salad");
	}
	
	public McDonalds getBurger() {
		return burger;
	}
}
