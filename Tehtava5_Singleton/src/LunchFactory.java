
public class LunchFactory implements MealFactory{
	private static LunchFactory INSTANCE = null;
	
	private LunchFactory() {}
	
	public static LunchFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LunchFactory();
		}
		return INSTANCE;
	}

	@Override
	public Food createFood() {
		return new Spaghetti();
	}

	@Override
	public Drink createDrink() {
		return new Water();
	}
}
