import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Clock implements Observer{
	
	private Timer timer;
	
	public Clock(Timer timer) {
		this.timer = timer;
		timer.addObserver(this);
	}

	public void update(Observable o, Object arg) {
			draw();
	}
	
	private void draw() {
		String seconds = numberFormatter(timer.getSeconds());
		String minutes = numberFormatter(timer.getMinutes());
		String hours = numberFormatter(timer.getHours());
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
	
	private String numberFormatter(int number) {
		if (number < 10) {
			return "0" + number;
		}
		return Integer.toString(number);
	}
}
