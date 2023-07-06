package lesson23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunuOrnek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("dogum gununuzu giriniz (gun/ay/yıl giriniz)");
		String dogumGunu = scanner.nextLine();
		
//		String gun2 ="2010-05-18";
//		LocalDate date = LocalDate.parse(gun2);
		
		LocalDate now = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dogumGunu2 = LocalDate.parse(dogumGunu,formatter);
		System.out.println("dogum gunu "+ dogumGunu2);
		
		long gun = dogumGunu2.until(now, ChronoUnit.DAYS);
		long ay = dogumGunu2.until(now, ChronoUnit.MONTHS);
		long yil = dogumGunu2.until(now, ChronoUnit.YEARS);
		long hafta = dogumGunu2.until(now, ChronoUnit.WEEKS);
		System.out.println(yil+" yıl "+ay+" ay "+hafta+" hafta "+gun+" gundur dunyadasınız");
		
		
		
	}
}
