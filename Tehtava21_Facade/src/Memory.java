
public class Memory {
	private char[] RAM = new char[10];

	public void Load(int position, char data) {
		System.out.println("Loading data into memory.");
		RAM[position] = data;
	}
	
	public char getData(int position) {
		return RAM[position];
	}
}
