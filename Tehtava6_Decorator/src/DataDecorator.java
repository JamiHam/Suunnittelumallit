
public class DataDecorator implements IData{
	protected IData dataToBeDecorated;
	
	public DataDecorator(IData dataToBeDecorated) {
		this.dataToBeDecorated = dataToBeDecorated;
	}
	
	public void selectAction() {
		dataToBeDecorated.selectAction();
	}
	
	public void printData() {
		dataToBeDecorated.selectAction();
	}
	
	public void addData() {
		dataToBeDecorated.addData();
	}
}
