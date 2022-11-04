
public class BonusVisitor implements Visitor {

	@Override
	public void visit(CharmanderState state, Pokemon pokemon) {
		giveBonusExperience(1, pokemon);
	}

	@Override
	public void visit(CharmeleonState state, Pokemon pokemon) {
		giveBonusExperience(2, pokemon);
	}

	@Override
	public void visit(CharizardState state, Pokemon pokemon) {
		giveBonusExperience(3, pokemon);
	}
	
	private void giveBonusExperience(int bonus, Pokemon pokemon) {
		pokemon.gainExperience(bonus);
		System.out.println("Charizard gained " + bonus + " bonus experience!");
	}
}
