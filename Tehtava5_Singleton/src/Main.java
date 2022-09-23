
public class Main {

	public static void main(String[] args) {
		MealFactory mealFactory = BreakfastFactory.getInstance();
		//MealFactory mealFactory = LunchFactory.getInstance();
		Food food;
		Drink drink;
		
		food = mealFactory.createFood();
		drink = mealFactory.createDrink();
		
		System.out.println("Your meal is " + food + " with " + drink);
	}
}
