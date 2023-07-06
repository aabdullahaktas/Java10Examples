package lesson17Ornek1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		

		Otomobil otomobil = new Otomobil();
		otomobil.hizlanma();
		Arac arac1 = new Kamyon();
		Arac arac2 = new Otomobil();
		Arac arac3 = new YukGemisi();
		Arac arac4 = new KargoUcak();
		Arac arac5 = new YolcuUcak();
		Arac arac6 = new YolcuGemisi();

		
		
		Ucak ucak1 = new YolcuUcak();
		kalkisaIzinVer((Ucak)arac4);
		kalkisaIzinVer((Ucak)arac5);
		kalkisaIzinVer(ucak1);
		yukVerme((Kamyon)arac1);
		
		IYuk arac7 = new YukGemisi();
		IYuk arac8 = new KargoUcak();
		IYuk arac9 = new Kamyon();
		((Gemi)arac7).hizlanma();
		yukVerme(arac9);
		yukVerme(arac8);
		yukVerme(arac7);
		Hekikopter helikopter = new Hekikopter();
		kalkisaIzinVer(helikopter);
		
		
	}
	public static void kalkisaIzinVer(IHavaTasiti havaTasiti) {
		System.out.println("kalkısa izin verildi.");
		havaTasiti.kalkisYap();
	}
	static Scanner scanner = new Scanner(System.in);
	
	public static void yukVerme(IYuk arac) {
		System.out.println("yuk giriniz");
		arac.yukAl();
		
	}

}
