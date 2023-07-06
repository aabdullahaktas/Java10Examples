package lesson32.factory.pizzaApp;

public class KlasikPizza extends Pizza{

	public KlasikPizza(EHamurTipi hamurTipi, ETur tur, EBoyut boyut) {
		super(hamurTipi, tur, boyut);
		// TODO Auto-generated constructor stub
	}
	public KlasikPizza(EHamurTipi hamurTipi, ETur tur, EBoyut boyut,double fiyat) {
		super(hamurTipi, tur, boyut,fiyat);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "KlasikPizza [getHamurTipi()=" + getHamurTipi() + ", getTur()=" + getTur() + ", getBoyut()=" + getBoyut()
				+ ", getFiyat()=" + getFiyat() + "]";
	}
	

}
