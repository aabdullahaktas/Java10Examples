package lesson19.queue;

public class Musteri implements Comparable<Musteri>{
	
	String isim;
	int yas;
	
	public Musteri(String isim, int yas) {
		super();
		this.isim = isim;
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Musteri [isim=" + isim + ", yas=" + yas + "]";
	}

	/*@Override
	public int compareTo(Musteri other) {
		if (this.yas < other.yas) {
			return -1;
		}else if(this.yas > other.yas){
			return 1;
		}
		return 0;
	}*/
	
	@Override
	public int compareTo(Musteri other) {
		return this.yas - other.yas;
	}
	
}
