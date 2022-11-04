
public class Waiter {
	private IBurgerBuilder burgerBuilder;
	
	public void setBurgerBuilder(IBurgerBuilder burgerBuilder) {
		this.burgerBuilder = burgerBuilder;
	}
	
	public void ConstructBurger() {
		burgerBuilder.createBurger();
		burgerBuilder.buildBun();
		burgerBuilder.buildSauce();
		burgerBuilder.buildPatty();
		burgerBuilder.buildSalad();
	}
}
