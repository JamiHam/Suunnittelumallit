
public class BreakfastFactory implements MealFactory{
	private static BreakfastFactory INSTANCE = null;
	
	private BreakfastFactory() {}
	
	public static BreakfastFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new BreakfastFactory();
		}
		return INSTANCE;
	}

	@Override
	public Food createFood() {
		return new Bread();
	}

	@Override
	public Drink createDrink() {
		return new Coffee();
	}
}
