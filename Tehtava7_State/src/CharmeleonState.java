
public class CharmeleonState implements State {
	private static CharmeleonState INSTANCE = null;
	
	private CharmeleonState() {}
	
	public static CharmeleonState getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CharmeleonState();
		}
		return INSTANCE;
	}
	
	public void useMove1(Pokemon pokemon) {
		System.out.println("Charmeleon used Dragon Breath.");
		pokemon.gainExperience();
	}
	
	public void useMove2(Pokemon pokemon) {
		System.out.println("Charmeleon used Fire Fang.");
		pokemon.gainExperience();
	}
	
	public void useMove3(Pokemon pokemon) {
		System.out.println("Charmeleon used Slash.");
		pokemon.gainExperience();
	}
	
	public void evolve(Pokemon pokemon) {
		pokemon.changeState(CharizardState.getInstance());
		System.out.println("What? Charmeleon is evolving!");
		System.out.println("Congratulations! Your Charmeleon evolved into Charizard!");
	}
}
