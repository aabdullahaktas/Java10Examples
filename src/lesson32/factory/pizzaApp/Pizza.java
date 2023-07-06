package lesson32.factory.pizzaApp;

public abstract class Pizza {
	
	private EHamurTipi hamurTipi;
	private ETur tur;
	private EBoyut boyut;
	private double fiyat;
	
	public Pizza(EHamurTipi hamurTipi, ETur tur, EBoyut boyut) {
		super();
		this.hamurTipi = hamurTipi;
		this.tur = tur;
		this.boyut = boyut;
	}
	
	public Pizza(EHamurTipi hamurTipi, ETur tur, EBoyut boyut, double fiyat) {
		super();
		this.hamurTipi = hamurTipi;
		this.tur = tur;
		this.boyut = boyut;
		this.fiyat = fiyat;
	}
	
	public EHamurTipi getHamurTipi() {
		return hamurTipi;
	}
	public void setHamurTipi(EHamurTipi hamurTipi) {
		this.hamurTipi = hamurTipi;
	}
	public ETur getTur() {
		return tur;
	}
	public void setTur(ETur tur) {
		this.tur = tur;
	}
	public EBoyut getBoyut() {
		return boyut;
	}
	public void setBoyut(EBoyut boyut) {
		this.boyut = boyut;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}
	
	
}