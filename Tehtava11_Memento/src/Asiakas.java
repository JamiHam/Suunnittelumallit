
public class Asiakas extends Thread {
	private String nimi;
	private Arvuuttaja arvuuttaja;
	private Object memento;
	private boolean running;
	
	public Asiakas(String nimi, Arvuuttaja arvuuttaja) {
		this.nimi = nimi;
		this.arvuuttaja = arvuuttaja;
	}
	
	public void run() {
		running = true;
		memento = arvuuttaja.liityPeliin(nimi);
		while (running) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int arvaus = (int) (Math.random() * 10);
			boolean tulos = arvuuttaja.arvaa(arvaus, memento);
			if (tulos) running = false;
		}
	}
}
