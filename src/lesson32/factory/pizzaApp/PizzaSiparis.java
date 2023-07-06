package lesson32.factory.pizzaApp;

import java.util.Scanner;

/*
 * turu hamur tipini ve boyutu secip bir factory sınıfına yollayıp bize bir
 * pizza donmesini istiyoruz
 * 
 * turu ve hamurtipini secelim
 * 
 * pizza Factory sınfında bir pizza olustur metodu yazıp bu metotdan aldıgımız
 * verilerle bir pizza olustrup geri donelim
 * 
 * 
 */
public class PizzaSiparis {
	
	public void menu() {
		System.out.println("Pizza Sipariş Menusu");
		Pizza pizza = pizzaSec3();
		siparisHazirlama(pizza);
	}

	private Pizza pizzaSec2() {
        EBoyut boyut = (EBoyut)secim(EBoyut.values(),"Lutfen bir pizza boyutu seciniz");
		ETur tur = (ETur)secim(ETur.values(),"Lutfen bir pizza turu seciniz");
		EHamurTipi hamurTipi = (EHamurTipi)secim(EHamurTipi.values(),"Lütfen bir hamur tipi seciniz");
		return PizzaFactory.pizzaOlustur(boyut, tur,hamurTipi);
	}
	
	// 2. yontem
	public Enum secim(Enum[] dizi,String sorgu) {
		
		for (Enum deger : dizi) {
			System.out.println((deger.ordinal()+1)+"-"+deger);
		}
		int secim =Utility.intDegerAlma(sorgu);
		return dizi[secim - 1];
	}
	
	// 3. yöntem
	
	public <T> T secim2(T[]dizi,String sorgu) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i+1)+"-"+dizi[i]);
		}
		int secim =Utility.intDegerAlma(sorgu);
		return dizi[secim - 1];
	}
	private Pizza pizzaSec3() {
        EBoyut boyut = secim2(EBoyut.values(),"Lutfen bir pizza boyutu seciniz");
		ETur tur = secim2(ETur.values(),"Lutfen bir pizza turu seciniz");
		EHamurTipi hamurTipi = secim2(EHamurTipi.values(),"Lütfen bir hamur tipi seciniz");
		return PizzaFactory.pizzaOlustur(boyut, tur,hamurTipi);
	}
	
	
	
	
	public EBoyut boyutSec() {
		for (EBoyut boyut : EBoyut.values()) {
			System.out.println((boyut.ordinal()+1)+"-"+boyut);
		}
		int secim = Utility.intDegerAlma("Lütfen bir pizza boyutu seciniz");
		return EBoyut.values()[secim-1];
	}
	
	public EHamurTipi hamurTipiSec() {
		for (EHamurTipi hamurTipi : EHamurTipi.values()) {
			System.out.println((hamurTipi.ordinal()+1)+"-"+hamurTipi);
		}
		int secim = Utility.intDegerAlma("Lütfen bir pizza hamur tipini seciniz");
		return EHamurTipi.values()[secim-1];
	}
	public ETur turSec() {
		for (ETur tur : ETur.values()) {
			System.out.println((tur.ordinal()+1)+"-"+tur);
		}
		int secim = Utility.intDegerAlma("Lütfen bir pizza türü seciniz");
		return ETur.values()[secim-1];
	}
	
	
	private void siparisHazirlama(Pizza pizza) {
		System.out.println("Siparişiniz ===> "+ pizza);
		System.out.println("Hazırlanıyor....");
	}
	
}
