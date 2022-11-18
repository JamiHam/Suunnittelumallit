
public class Clock implements Cloneable {
	private Hand hourHand;
	private Hand minuteHand;
	
	public Clock() {
		hourHand = new HourHand();
		minuteHand = new MinuteHand();
	}
	
	public void setTime(int hours, int minutes) {
		hourHand.setTime(hours);
		minuteHand.setTime(minutes);
	}
	
	public String toString() {
		return "Hour hand: " + hourHand.getTime() + "\nMinute hand: " + minuteHand.getTime();
	}
	
	public Clock clone() {
		Clock clock = null;
		try {
			clock = (Clock) super.clone();
			clock.hourHand = (Hand) hourHand.clone();
			clock.minuteHand = (Hand) minuteHand.clone();
		} catch (CloneNotSupportedException e) {}
		
		return clock;
	}
}
