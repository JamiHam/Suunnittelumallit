
public class Main {

	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Asiakas asiakas1 = new Asiakas("Matti", arvuuttaja);
		Asiakas asiakas2 = new Asiakas("Martta", arvuuttaja);
		Asiakas asiakas3 = new Asiakas("Väinö", arvuuttaja);
		
		asiakas1.start();
		asiakas2.start();
		asiakas3.start();
	}

}
