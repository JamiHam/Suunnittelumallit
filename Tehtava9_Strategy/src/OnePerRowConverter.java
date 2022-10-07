import java.util.Iterator;
import java.util.List;

public class OnePerRowConverter implements ListConverter {
	public String listToString(List list) {
		String listString = "";
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()) {
			listString += iterator.next();
			listString += "\n";
		}
		
		return listString;
	}
}
