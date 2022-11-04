
public class Main {
	
	public static void main(String args[]) {
		Cat cat = new Cat();
		DogAdapter dogAdapter = new DogAdapter();
		
		cat.makeSound();
		dogAdapter.makeSound();
	}
}
