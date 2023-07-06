package lesson23.tryCatch;

import java.util.Scanner;

/*
 * bolme islemi icin metot yazalım dısarıdan 1. ve 2. sayıyı allaım 
 * bolme 
 * 
 */
public class Test {
	public static void main(String[] args) {
//		int sayi1 = 0;
//		int sayi2 = 20;
//		Integer sayi3 = null;
//		int sonuc=0;
//		try {
//			sonuc = sayi2 / sayi1;
//			sonuc = sayi2 / sayi3;
//			System.out.println("basarılı kod");
//		}catch (ArithmeticException e) {			
//		System.out.println(e.toString());
//		System.out.println(e.getMessage());
//		System.out.println("hata yakalandı bir sayi sıfıra bolunemez");
//		} catch (NullPointerException e) {
//			System.out.println("genel exception");
//			e.printStackTrace();
//		}catch (Exception e) {
//			System.out.println("baska bir hata");
//			e.printStackTrace();
//		}
//		System.out.println("sonuc "+sonuc);
		
		System.out.println("sonuc: "+ bolme());
		
		
	}
	
	private static double bolme() {
		Scanner scanner = new Scanner(System.in);
		double sonuc=0;
		boolean kontrol = false;
		do {
			try {
				System.out.println("1. sayi giriniz");
				int sayi1 = scanner.nextInt();
				System.out.println("2. sayi giriniz");
				int sayi2 = scanner.nextInt();
				sonuc=sayi1/sayi2;
				kontrol= false;
				// break;
				break;
			} catch (Exception e) {
				System.out.println("hata olustu: "+e.toString());
				kontrol = true;
			}
		} while (kontrol);

		return sonuc;
	}
	
}
