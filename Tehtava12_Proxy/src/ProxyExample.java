import java.util.ArrayList;
import java.util.List;

public class ProxyExample {
	/**
	 * Test method
	 */
	public static void main(final String[] arguments) {
		List<Image> folder = new ArrayList<Image>();
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");
		Image image3 = new ProxyImage("HiRes_10MB_Photo3");
		
		folder.add(image1);
		folder.add(image2);
		folder.add(image3);
		
		System.out.println("Images in folder:");
		for (Image image : folder) {
			image.showData();
		}
		
		for (Image image : folder) {
			image.displayImage();
		}
	}
}
