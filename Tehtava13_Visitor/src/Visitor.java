
public interface Visitor {
	public void visit(CharmanderState state, Pokemon pokemon);
	public void visit(CharmeleonState state, Pokemon pokemon);
	public void visit(CharizardState state, Pokemon pokemon);
}
