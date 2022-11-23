
public class CPU {
	private int position;
	
	public void Freeze() {
		System.out.println("Freeze.");
	}
	
	public void Jump(int position) {
		System.out.println("Jumping to " + position);
		this.position = position;
	}
	
	public void Execute(Memory memory) {
		System.out.println("Executing " + memory.getData(position));
	}
}
