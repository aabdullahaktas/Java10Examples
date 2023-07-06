package lesson23.tryCatch;
/*
 * checked exception ==> kontrol edilmesi zorunlu istisnlar exteption sınıfından extends alırlar.
 * bir metot içinde checked exception fırlatıyorisek metoda fırlattıgımız 
 * exception turunu declare etmek zorundayız
 * ve metodu kullandıgımız yerde bu metodu try catch içine almak zorundayız
 * 
 * unchecked exception ==> kontrol edilmesi zorunlu olmayan istisnalar runtime exception 
 * sınıfından extends alırlar kontrol etmek zorunlu degildir fakat hatalı 
 * bir deger girildi
 * 
 */
public class InfinityTest {
	public static void main(String[] args) {
		try {
			System.out.println(bolme(20,10));
		} catch (InfinityException e) {
			e.printStackTrace();
		}
		System.out.println("program calısıyor");
		
		
		try {
			pozitifDegerlerToplami(5, -5);
		} catch (EksiDegerException e) {
			System.out.println("hata olustu"+ e.toString());
		}
		System.out.println("program 2. kez calısmaya devam ediyor");
		
		
		
	}
	public static double bolme(double sayi1,double sayi2) throws InfinityException { // throws metodda declaritıon yapılamlı 
		if(sayi2==0) {
			throw new InfinityException("sonsuzluk hatasi");
		}
		return sayi1/sayi2;
	}
	
	
	public static int pozitifDegerlerToplami(int sayi1,int sayi2) { // unchecked exception kontrol edilmesi zorunlu değil
		if(sayi1<0||sayi2<0) {
			throw new EksiDegerException("girilen degerler pozitif olmali");
		}
		return sayi1+sayi2;
	}

}
