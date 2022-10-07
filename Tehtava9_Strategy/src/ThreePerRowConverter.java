import java.util.List;

public class ThreePerRowConverter implements ListConverter {
	public String listToString(List list) {
		String listString = "";
		for (int i = 0; i < list.size(); i++) {
			listString += list.get(i);
			
			if ((i + 1) % 3 == 0) {
				listString += "\n";
			} else {
				listString += " ";
			}
		}
		return listString;
	}
}
