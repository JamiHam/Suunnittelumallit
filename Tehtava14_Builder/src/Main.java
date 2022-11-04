
public class Main {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		IBurgerBuilder burgerBuilder = new HesburgerBuilder();
		IBurgerBuilder burgerBuilder2 = new McDonaldsBuilder();
		
		waiter.setBurgerBuilder(burgerBuilder);
		waiter.ConstructBurger();
		
		Hesburger burger = (Hesburger) burgerBuilder.getBurger();
		System.out.println(burger);
		
		waiter.setBurgerBuilder(burgerBuilder2);
		waiter.ConstructBurger();
		
		McDonalds burger2 = (McDonalds) burgerBuilder2.getBurger();
		System.out.println(burger2);
	}
}
