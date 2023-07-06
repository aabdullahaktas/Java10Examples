package lesson25.optional;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class UrunManager {
	
	Scanner scanner = new Scanner(System.in);
	
	public Optional<Urun> urunOlustur(){
		
		try {
			System.out.println("Urun adı giriniz.");
			String ad= scanner.nextLine();
			System.out.println("Urun fiyatı giriniz");
			double fiyat = Double.parseDouble(scanner.nextLine());
			System.out.println("urun son kullanma tarihi giriniz");
			LocalDate date = LocalDate.parse(scanner.nextLine());
			if (ad.isBlank() || fiyat<0) {
				//Optional.ofNullable(null);
				return Optional.empty();
				
			}else {
				System.out.println("urun ekelndi ");
				return Optional.of(new Urun(ad, fiyat, date));
				
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			return Optional.empty();
		}
	}
	public static void main(String[] args) {
		UrunManager urunManager = new UrunManager();
		Optional<Urun> urun = urunManager.urunOlustur();
		

		
		//urunManager.urunOlustur().ifPresent(x->System.out.println("isim==")+x.);
	}
	
	
}
