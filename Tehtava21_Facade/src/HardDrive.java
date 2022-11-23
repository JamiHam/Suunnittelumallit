
public class HardDrive {
	private char[] data = {'a', 'b', 'c', 'd', 'e', 'f'};
	
	public char Read(int lba) {
		System.out.println("Loading data from hard drive.");
		return data[lba];
	}
}
