
public class Pokemon {
	private State state;
	private int experience;
	private int requiredExperience;
	
	public Pokemon() {
		state = CharmanderState.getInstance();
		experience = 0;
		requiredExperience = 5;
	}
	
	public void useMove1() {
		state.useMove1(this);
	}
	
	public void useMove2() {
		state.useMove2(this);
	}
	
	public void useMove3() {
		state.useMove3(this);
	}
	
	protected void changeState(State state) {
		this.state = state;
	}
	
	public void gainExperience(int experiencePoints) {
		experience += experiencePoints;
		checkForEvolution();
	}
	
	private void checkForEvolution() {
		if (experience >= requiredExperience) {
			state.evolve(this);
			experience = 0;
			requiredExperience += 5;
		}
	}
	
	public void accept(Visitor visitor) {
		state.accept(visitor, this);
	}
}
