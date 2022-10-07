import java.util.List;

public class TwoPerRowConverter implements ListConverter {
	public String listToString(List list) {
		String listString = "";
		Object[] listArray = list.toArray();
		
		for (int i = 0; i < listArray.length; i++) {
			listString += listArray[i].toString();
			
			if ((i + 1) % 2 == 0) {
				listString += "\n";
			} else {
				listString += " ";
			}
		}
		return listString;
	}
}
