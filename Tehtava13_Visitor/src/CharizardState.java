
public class CharizardState implements State {
	private static CharizardState INSTANCE = null;
	
	private CharizardState() {}
	
	public static CharizardState getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CharizardState();
		}
		return INSTANCE;
	}
	
	public void useMove1(Pokemon pokemon) {
		System.out.println("Charizard used Fire Spin.");
		pokemon.gainExperience(1);
	}
	
	public void useMove2(Pokemon pokemon) {
		System.out.println("Charizard used Inferno.");
		pokemon.gainExperience(1);
	}
	
	public void useMove3(Pokemon pokemon) {
		System.out.println("Charizard used Flare Blitz.");
		pokemon.gainExperience(1);
	}
	
	public void evolve(Pokemon pokemon) {
		System.out.println("Already fully evolved.");
	}
	
	public void accept(Visitor visitor, Pokemon pokemon) {
		visitor.visit(this, pokemon);
	}
}
