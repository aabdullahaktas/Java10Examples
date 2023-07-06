package lesson18.Odev;

import java.util.Scanner;
/*
 * 1 database metdodu yapalım 
 * 2 secenek tutsun bunlardan birini secip
 * daha sonra manager sınıfındaki calıstır metodunu calıştıralım
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		databaseSec();
	}
	public static void databaseSec() {
		Manager manager;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.MySql");
		System.out.println("2.Oracle");
		System.out.println("3.PostgreSql");
	    System.out.println("Lütfen bir secim yapınız");
		int secim=scanner.nextInt();
		Database database =null;
		secim = scanner.nextInt();
		switch (secim) {
		case 1:
			database = new MySql();
			break;
		case 2:
			database = new Oracle();
			break;
		case 3:
			database = new PostgreSql();
			break;
		default:
			System.out.println("yalnış seçim yaptınız");
			break;
	}
		manager = new Manager(database);
		manager.calistir();
    }
}
