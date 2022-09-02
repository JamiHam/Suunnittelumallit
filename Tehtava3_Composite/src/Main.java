
public class Main {

	public static void main(String[] args) {
		Component computer = new Case();
		Component motherboard = new Motherboard();
		Component memory = new Memory();
		Component processor = new Processor();
		Component networkAdapter = new NetworkAdapter();
		Component graphicsCard = new GraphicsCard();
		Component storage = new Storage();
		
		motherboard.Add(memory);
		motherboard.Add(processor);
		motherboard.Add(networkAdapter);
		motherboard.Add(graphicsCard);
		motherboard.Add(storage);
		
		computer.Add(motherboard);
		
		System.out.println("Price: " + computer.getPrice() + "€");
	}
}
