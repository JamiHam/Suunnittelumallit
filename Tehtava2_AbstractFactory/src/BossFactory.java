

public class BossFactory implements OutfitFactory{

	public Jeans createJeans() {
		return new BossJeans();
	}

	public TShirt createTShirt() {
		return new BossTShirt();
	}

	public Hat createHat() {
		return new BossHat();
	}

	public Shoes createShoes() {
		return new BossShoes();
	}
}
