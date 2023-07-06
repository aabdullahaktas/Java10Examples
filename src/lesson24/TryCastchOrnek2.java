package lesson24;

import java.util.Scanner;

/*
 * 1- 1 metot yazacagız dısarıdan bir index alacak sonra o indexdeki degeri yazdıracagız 
 * hata varsada hatayı yakalayıp hata mesajını yazdıralım
 * 2- array üzerinde gezelim toplayabildiğimiz degerleri toplam degiskenine ekleyerek bir toplam sonucu bulalım
 * ve bir sayac ile de hata sayısını tutalım dongu sonundada toplamı ve hata sayısını yazdıralım
 * 
 */
public class TryCastchOrnek2 {
	public static void main(String[] args) {

				String [] array = {"null","30","a","20","ab",null,"50"};
				
				//indexdekiDegeriYazdir(array);

				//toplamDEgeriniVeHataSayisiniBul(array);
				toplamDEgeriniVeHataSayisiniBul2(array);
				System.out.println("program devam ediyor");
	}
	
	private static void toplamDEgeriniVeHataSayisiniBul(String []array) {
		int toplam=0;
		int sayac=0;
		for (String string : array) {
			try {
				string.charAt(0);
				toplam+=Integer.parseInt(string); 
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			}catch (Exception e) {
				System.out.println("baska bir hata: "+e.toString());
				sayac++;
			}
		}
		System.out.println("hata sayisi: "+sayac);
		System.out.println("toplam: "+toplam);
	}
		private static void toplamDEgeriniVeHataSayisiniBul2(String []array) {
			int toplam=0;
			int sayac=0;
			for (String string : array) {
				try {
					nullKontrolu(string);
					toplam+=Integer.parseInt(string); 
				} catch (NumberFormatException e) {
					System.out.println(e.toString());
					sayac++;
				} catch (Exception e) {
					System.out.println(e.toString());
					sayac++;
				}
			}
			System.out.println("hata sayisi: "+sayac);
			System.out.println("toplam: "+toplam);
	}
		public static String nullKontrolu(String string) { // unchecked exception
			if(string == null) {
				throw new NullPointerException("Null Hatası");
			}
			return string;
		}
		public static String nullKontrolu2(String string) throws Exception { // checked exception
			if(string == null) {
				throw new NullPointerException("Null Hatası");
			}
			return string;
		}
	private static void indexdekiDegeriYazdir(String [] array) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Index numarasını giriniz");
			int index = scanner.nextInt();
			System.out.println(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString() + " Arayin bouyutu: " + array.length + " lutfen 0 ile " + array.length
					+ " arasında bir sayi giriniz");
			//e.printStackTrace();
		}

		
	}

}
