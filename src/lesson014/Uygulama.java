package lesson014;

import java.util.Scanner;

/*
 * 1 kullanıcı sınıfımız olacak 
 * - kullanıcılarımız username ve sifre ile giriş yapsın 
 * - daha sonra sepetlerine urun ekleyebilsinler 
 * 2 kullanıcılarımızı database de tutalım 
 * - database de baslangıcta 3 tane default kullanıcı olsun 
 * - uygulama içinde kayıt ol seceneği ile burdaki databaseimize kullanıcı ekleyelim 
 * 3-sepet-->sepetimizde eklediğimiz urunleri tutan bir yapı
 * olsun her kullanıcı kedni sepetine urun ekleyebilecek
 * 4- urunlermizde enum yapalım
 *CIPS, KOLA, SEKER, YAG, UN, EKMEK, ÇAY, YUMURTA, YOGURT, SUT
 *
 */
public class Uygulama {
	Scanner scanner = new Scanner(System.in);
	
	public void menu() {
		System.out.println("1-Kayıt Ol");
		System.out.println("2-Giris yap");
		System.out.println("3- kullanıcı goster");
		System.out.println("4-Cıkıs");
		
	}
	public int secimYap() {
		System.out.println("işlem seciniz");
		String secim = scanner.nextLine();
		return Integer.parseInt(secim);
	}
	
	int kontrol =4;
	public void uygulamayiBaslat() {
		Database.baslangicVerisiEkle();
		do {
			menu();
			kontrol = secimYap();
			switch (kontrol) {
			case 1: {
				kayitOl();
				break;
			}
			case 2: {
				giriYap();
				break;
			}
			case 3: {
				kullanicilariGoster();
				break;
			}
			case 4: {
				
				break;
			}
			default:
				break;
			}
		} while (kontrol !=4);
	}
	
	private void giriYap() {
		System.out.println("kullanıcı ismi Giriniz");
		String username = scanner.nextLine();
		System.out.println("sifre Giriniz");
		String sifre = scanner.nextLine();
		System.out.println("isim Giriniz");
		Database.kullaniciVarmi(username,sifre);
		Kullanici kullanici = Database.kullaniciVarmi(username, sifre);
		
		if (kullanici != null) {
			System.out.println("giriş basarılı");
			kullaniciMenusu(kullanici);
		}else {
			System.out.println("kullanıcı adı yada sifre hatalı");
		}
		
	}
	
	private void kullaniciMenusu(Kullanici kullanici) {
		String kontrol ="3";
		do {
			System.out.println("1-Sepeti Goster");
			System.out.println("2- urun ekle");
			System.out.println("3- cıkıs");
			switch (kontrol) {
			case "1": {
				sepetiGoster(kullanici);
				break;
			}
			case "2": {
				urunEkle(kullanici);
				break;
			}
			case "3": {
				
				break;
			}
			default:
				break;
			}
			
			
			
		} while (!kontrol.equals("3"));
	}
	
	private void urunEkle(Kullanici kullanici) {
		for (EUrun urun : EUrun.values()) {
			System.out.println((urun.ordinal()+1)+"-"+urun.toString());
		}
		System.out.println("lutfen bir urun seciniz");
		int index = scanner.nextInt()-1;
		scanner.next();
		kullanici.getSepet().getUrunler()[Sepet.index]=EUrun.values()[index];
		Sepet.index++;
		System.out.println(EUrun.values()[index]+"");
		
	}
	private void sepetiGoster(Kullanici kullanici) {
		// TODO Auto-generated method stub
		
	}
	private void kullanicilariGoster() {
		System.out.println("-------kullanıcılar---------");
		
		for (Kullanici kullanici : Database.kullanicilar) {
			
			if (kullanici != null) {
				System.out.println(kullanici);
			}
			
		}
		
	}
	
	private void kayitOl() {
		System.out.println("kullanıcı ismi Giriniz");
		String username = scanner.nextLine();
		System.out.println("sifre Giriniz");
		String sifre = scanner.nextLine();
		System.out.println("isim Giriniz");
		String isim = scanner.nextLine();
		Kullanici kullanici= new Kullanici(Database.index+1,username,sifre,isim);
		Database.kullaniciEkle(kullanici);
		System.out.println("kullanıcı listesi uzunlugu = "+Database.kullanicilar.length);
		
		
	}
	
	
	
	

}
