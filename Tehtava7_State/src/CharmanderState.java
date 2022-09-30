
public class CharmanderState implements State {
	private static CharmanderState INSTANCE = null;
	
	private CharmanderState() {}
	
	public static CharmanderState getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CharmanderState();
		}
		return INSTANCE;
	}
	
	public void useMove1(Pokemon pokemon) {
		System.out.println("Charmander used Growl.");
		pokemon.gainExperience();
	}
	
	public void useMove2(Pokemon pokemon) {
		System.out.println("Charmander used Scratch.");
		pokemon.gainExperience();
	}
	
	public void useMove3(Pokemon pokemon) {
		System.out.println("Charmander used Ember.");
		pokemon.gainExperience();
	}
	
	public void evolve(Pokemon pokemon) {
		pokemon.changeState(CharmeleonState.getInstance());
		System.out.println("What? Charmander is evolving!");
		System.out.println("Congratulations! Your Charmander evolved into Charmeleon!");
	}
}
