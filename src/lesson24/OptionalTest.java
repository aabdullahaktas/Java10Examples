package lesson24;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		Integer sayi =5;
		
		Optional<Integer> sayi2 = Optional.of(10); // null degerler alamaz
		String deger = null;
		Optional<String> deger2=Optional.ofNullable(deger); // null degerler alabilir 
		System.out.println(sayi);
		System.out.println(sayi2);
		System.out.println(deger2);
		//Optional<String> deger3 = Optional.of(null);
		System.out.println(deger2.isEmpty());
		System.out.println(deger2.isPresent());
		if (deger2.isEmpty()) {
			//System.out.println(deger2.get()); bos bir degeri optional degeri get ile cağırılamaz hata fırlatır
			System.out.println(deger2);
		}
		deger2=Optional.of("5");
		if (deger2.isPresent()) {
			String deger3= deger2.get();
			Integer sayi3= sayi2.get();
			System.out.println(deger3+sayi3);
		}
		Optional<LocalDate> date = Utility.stringTarihDegeriniTarihDegerineCevirme("litfen bir tarij giriniz", "2022-05-20");
		System.out.println(date.isEmpty());
		if (date.isEmpty()) {
			System.out.println(date.get());
			System.out.println("tarih oluturlamamıs");
		}else {
			System.out.println(date.get());
		}
	}

}
