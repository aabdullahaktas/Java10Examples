package lesson014;

import lesson011.enums.EAylar;

public class Database {
	
	public static Kullanici [] kullanicilar = new Kullanici[6];
	public static int index;
	
	public static void baslangicVerisiEkle() {
		Kullanici kullanici1 = new Kullanici(index+1,"apo", "123", "Abdullah");
		kullanicilar[index]=kullanici1;
		index++;
		Kullanici kullanici2 = new Kullanici(index+1,"tubaaa", "123", "Tuba");
		kullanicilar[index]=kullanici2;
		index++;
		Kullanici kullanici3 = new Kullanici(index+1,"aliii", "123", "Ali");
		kullanicilar[index]=kullanici3;
		index++;
	}
	
	public static void kullaniciEkle(Kullanici kullanici) {
		
		if (kullanicilar[kullanicilar.length-1] != null) {
			arrayBoyutArttırma();
		}
		kullanicilar[Database.index]=kullanici;
		index++;
	}

	private static void arrayBoyutArttırma() {
		Kullanici[] temp = new Kullanici[kullanicilar.length + 5];
		
		for (int i = 0; i < kullanicilar.length; i++) {
			temp[i] = kullanicilar[i];
		}
		kullanicilar = temp;
		
	}

	public static Kullanici kullaniciVarmi(String username, String sifre) {
		
		for (Kullanici kullanici : kullanicilar) {
			if (kullanici!=null) {
				if (kullanici.getUsername().equals(username)&& kullanici.getPasword().equals(sifre)) {
					return kullanici;
				}
			}
		}
		return null;
	}
	
}
