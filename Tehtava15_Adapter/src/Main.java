
public class Main {
	
	public static void main(String args[]) {
		Animal cat = new Cat();
		Animal dog = new DogAdapter();
		
		cat.makeSound();
		dog.makeSound();
	}
}
