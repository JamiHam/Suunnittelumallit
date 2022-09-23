import java.util.Observable;

@SuppressWarnings("deprecation")
public class Timer extends Observable implements Runnable{
	private boolean running;
	private int seconds;
	private int minutes;
	private int hours;

	public Timer() {
		running = false;
		seconds = 0;
		minutes = 0;
		hours = 0;
	}

	public void run() {
		running = true;
		while (running) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tick();
		}
	}
	
	private void tick() {
		seconds++;
		if (seconds > 59) {
			seconds = 0;
			minutes++;
			if (minutes > 59) {
				minutes = 0;
				hours++;
			}
		}
		setChanged();
		notifyObservers();
	}
	
	public void stop() {
		running = false;
	}
	
	public int getSeconds() {
		return seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getHours() {
		return hours;
	}
}
