
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Pokemon pokemon = new Pokemon();
		
		while (true) {
			pokemon.useMove1();
			Thread.sleep(1000);
			
			pokemon.useMove2();
			Thread.sleep(1000);
			
			pokemon.useMove3();
			Thread.sleep(1000);
		}
	}
}
