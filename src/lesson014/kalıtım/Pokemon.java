package lesson014.kalıtım;

public class Pokemon {
	private int id;
	private String ad;
	private int guc;
	private int seviye;
	private int can;
	private String tur;
	
	
	public Pokemon(String ad, int guc, int seviye, int can, String tur) {
		super();
		this.ad = ad;
		this.guc = guc;
		this.seviye = seviye;
		this.can = can;
		this.tur = tur;
	}



	public Pokemon(int id, String ad, int guc, int seviye, int can, String tur) {
		super();
		this.id = id;
		this.ad = ad;
		this.guc = guc;
		this.seviye = seviye;
		this.can = can;
		this.tur = tur;
	}

	
	
	public void saldir() {
		System.out.println(ad+"adi pokemon saldırıyor");
	}
	
	public void kacinma() {
		System.out.println(ad+"adi pokemon kaçındı");
	}
	public void pokedex() {
		System.out.println("POKEDEX");
		System.out.println("=================");
	}
	

	public int getSeviye() {
		return seviye;
	}

	public void setSeviye(int seviye) {
		this.seviye = seviye;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getGuc() {
		return guc;
	}

	public void setGuc(int guc) {
		this.guc = guc;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}
	
}
