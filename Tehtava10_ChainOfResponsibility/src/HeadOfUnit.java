
public class HeadOfUnit extends RaiseHandler {
private final double MAXRAISE = 5;
	
	public void processRequest(RaiseRequest request) {
		if (request.getRaisePercentage() < MAXRAISE) {
			System.out.println("Head of unit will approve " + request.getRaisePercentage());
		} else {
			super.processRequest(request);
		}
	}
}
