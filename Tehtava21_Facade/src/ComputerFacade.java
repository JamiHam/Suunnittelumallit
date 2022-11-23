
public class ComputerFacade {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public ComputerFacade() {
		cpu = new CPU();
		memory = new Memory();
		hardDrive = new HardDrive();
	}
	
	public void Start() {
		for (int i = 0; i < 6; i++) {
			cpu.Freeze();
			memory.Load(i, hardDrive.Read(i));
			cpu.Jump(i);
			cpu.Execute(memory);
		}
	}
}
