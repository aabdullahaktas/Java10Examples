package lesson24;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class Utility {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
//		intDegerAlma("lutfen birsayı giriniz");
//		intDegerAlma("lutfen bir secim yapınız");
		stringTarihDegerAlma("lutfen tarıh giriniz");
	}
	
	// dogru deger alana kadar bizden veri almaya devam eder  int deger alana kadar
	
	public static int intDegerAlma(String sorgu) {
		
		boolean kontrol = false;
		int deger=0;
		do {
			System.out.println(sorgu);
			try {
				deger = scanner.nextInt();
				scanner.nextLine();
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString()+" : lutfen sayısal bir deger giriniz");
				kontrol = true;
			}finally {
				scanner.nextLine();
			}
		}while(kontrol);
		return deger;
	}
	
	public static double doubleDegerAlma(String sorgu) {
		
		boolean kontrol = false;
		double deger=0D;
		do {
			System.out.println(sorgu);
			try {
				deger = Double.parseDouble(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString()+" : lutfen sayısal bir deger giriniz");
				kontrol = true;
			}
		}while(kontrol);
		return deger;
	}
	public static long longDegerALma(String sorgu) {
		
		boolean kontrol = false;
		long deger=0L;
		do {
			System.out.println(sorgu);
			try {
				deger = Long.parseLong(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString()+" : lutfen sayısal bir deger giriniz");
				kontrol = true;
			}
		}while(kontrol);
		return deger;
	}
	
	public static String stringDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}
	
	public static LocalDate stringTarihDegerAlma(String sorgu) {
		boolean kontrol = false;
		LocalDate date = null;
		do {
			try {
				System.out.println(sorgu);
				date=LocalDate.parse(scanner.nextLine());
				kontrol= false;
			} catch (Exception e) {
				System.out.println(e.toString()+"lutfen yıl-ay-gun formatında bir tarih giriniz");
				kontrol =true;
			}
		} while (kontrol);
		return date;
	}
	public static Optional<LocalDate> stringTarihDegeriniTarihDegerineCevirme(String sorgu,String tarih) {
		boolean kontrol = false;
		LocalDate date = null;
			try {
				System.out.println(sorgu);
				date=LocalDate.parse(tarih);
				kontrol= false;
			} catch (Exception e) {
				System.out.println(e.toString()+"lutfen yıl-ay-gun formatında bir tarih giriniz");
				kontrol =true;
			}
		return Optional.ofNullable(date);
	}
}
