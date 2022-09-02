

public class AdidasFactory implements OutfitFactory{

	public Jeans createJeans() {
		return new AdidasJeans();
	}

	public TShirt createTShirt() {
		return new AdidasTShirt();
	}

	public Hat createHat() {
		return new AdidasHat();
	}

	public Shoes createShoes() {
		return new AdidasShoes();
	}

}
