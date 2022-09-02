public class Main {

	public static void main(String[] args) {
		OutfitFactory factory = new AdidasFactory();
		
		Jeans jeans = factory.createJeans();
		TShirt tShirt = factory.createTShirt();
		Hat hat = factory.createHat();
		Shoes shoes = factory.createShoes();
		
		System.out.println("I'm wearing " + jeans + ", " + tShirt + ", " + hat + " and " + shoes + ".");
	}
}
