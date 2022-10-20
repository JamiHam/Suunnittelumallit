
public abstract class RaiseHandler {
	
	private RaiseHandler successor;
	
	public void setSuccessor(RaiseHandler successor) {
		this.successor = successor;
	}
	
	public void processRequest(RaiseRequest request) {
		if (successor != null) {
			successor.processRequest(request);
		}
	}
}
