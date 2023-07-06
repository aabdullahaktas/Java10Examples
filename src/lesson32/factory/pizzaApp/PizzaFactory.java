package lesson32.factory.pizzaApp;

public class PizzaFactory {
	
	public static Pizza pizzaOlustur(EBoyut boyut, ETur tur, EHamurTipi hamurTipi) {
		switch (tur) {
		case TON_BALIKLI,KARİSİK:
			
			return new KlasikPizza(hamurTipi, tur, boyut);
		case AKDENİZ:
			
			return new VeganPizza(hamurTipi, tur, boyut);

		default:
			throw new RuntimeException("Hatalı pizza Seçimi");
		}
	}


}
