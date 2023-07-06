package lesson32.factory.pizzaApp;

public class VeganPizza extends Pizza{

	public VeganPizza(EHamurTipi hamurTipi, ETur tur, EBoyut boyut) {
		super(hamurTipi, tur, boyut);
		// TODO Auto-generated constructor stub
	}
	public VeganPizza(EHamurTipi hamurTipi, ETur tur, EBoyut boyut,double fiyat) {
		super(hamurTipi, tur, boyut,fiyat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "VeganPizza [getHamurTipi()=" + getHamurTipi() + ", getTur()=" + getTur() + ", getBoyut()=" + getBoyut()
				+ ", getFiyat()=" + getFiyat() + "]";
	}
	

}
