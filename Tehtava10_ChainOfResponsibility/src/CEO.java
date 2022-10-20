
public class CEO extends RaiseHandler {
	
	public void processRequest(RaiseRequest request) {
		System.out.println("CEO will approve " + request.getRaisePercentage());
	}
}
