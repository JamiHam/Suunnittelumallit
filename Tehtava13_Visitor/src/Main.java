
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Pokemon pokemon = new Pokemon();
		Visitor visitor = new BonusVisitor();
		
		while (true) {
			pokemon.useMove1();
			Thread.sleep(1000);
			
			pokemon.useMove2();
			Thread.sleep(1000);
			
			pokemon.useMove3();
			Thread.sleep(1000);
			
			pokemon.accept(visitor);
			Thread.sleep(1000);
		}
	}
}
