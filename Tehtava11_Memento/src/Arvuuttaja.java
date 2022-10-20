
public class Arvuuttaja {
	
	public Object liityPeliin(String nimi) {
		int luku = (int) (Math.random() * 10);
		return new Memento(nimi, luku);
	}
	
	public boolean arvaa(int arvaus, Object object) {
		Memento memento = (Memento) object;
		if (arvaus == memento.getLuku()) {
			System.out.println(memento.getNimi() + " arvasi oikein! (" + arvaus + ")");
			return true;
		}
		System.out.println(memento.getNimi() + " arvasi väärin... (" + arvaus + ")");
		return false;
	}
	
	private class Memento {
		private String nimi;
		private int luku;
		
		public Memento(String nimi, int luku) {
			this.nimi = nimi;
			this.luku = luku;
		}
		
		public String getNimi() {
			return nimi;
		}
		
		public int getLuku() {
			return luku;
		}
	}
}
