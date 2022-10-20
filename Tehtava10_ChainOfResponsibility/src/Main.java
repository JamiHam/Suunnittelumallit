
public class Main {

	public static void main(String[] args) {
		Supervisor supervisor = new Supervisor();
		HeadOfUnit headOfUnit = new HeadOfUnit();
		CEO ceo = new CEO();
		
		supervisor.setSuccessor(headOfUnit);
		headOfUnit.setSuccessor(ceo);
		
		RaiseRequest request = new RaiseRequest(4.9);
		supervisor.processRequest(request);
	}
}
