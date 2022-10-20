
public class Supervisor extends RaiseHandler {
	private final double MAXRAISE = 2;
	
	public void processRequest(RaiseRequest request) {
		if (request.getRaisePercentage() <= MAXRAISE) {
			System.out.println("Supervisor will approve " + request.getRaisePercentage());
		} else {
			super.processRequest(request);
		}
	}
}
