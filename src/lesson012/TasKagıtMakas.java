package lesson012;

import java.util.Random;
import java.util.Scanner;

import lesson011.enums.EAylar;

public class TasKagıtMakas {
	
	static ESecenek [] secenekler = ESecenek.values();
	
	public static ESecenek secimYap() {

		for (ESecenek secenek : secenekler) {
			System.out.println((secenek.ordinal()+1)+"-"+ secenek );
		}
		
		int secim = secimKontrol();
		return secenekler[secim-1];
	}
	
	public static int secimKontrol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen TAS/KAGIT/MAKAS seçiniz");
		int secim= -1;
		while ((secim = scanner.nextInt()) > 1 || secim>3) {
			System.out.println("yanlış bir seçim tekrar deneyiniz");
		}	
		return secim;
	}
	
	public static ESecenek pcSecimiYap() {
		Random random = new Random();
		int index = random.nextInt(secenekler.length);
		return secenekler[index];
	}
	
	public static void oyun() {
		ESecenek secimim= secimYap();
		ESecenek pcSecim= pcSecimiYap();
		
		if (pcSecim == secimim) {
			System.out.println("Beraberlik");
		}else {
			switch (secimim) {
			case TAS:
				if (pcSecim==ESecenek.KAGIT) {
					System.out.println("kaybettiniz");
				} else {
					System.out.println("Kazandınız");
				}
				break;
			case KAGIT:
				if (pcSecim==ESecenek.MAKAS) {
					System.out.println("kaybettiniz");
				} else {
					System.out.println("Kazandınız");
				}
				break;
			case MAKAS:
				if (pcSecim==ESecenek.TAS) {
					System.out.println("kaybettiniz");
				} else {
					System.out.println("Kazandınız");
				}
				break;

			default:
				break;
			}
		}
		System.out.println("Pc secimi : "+pcSecim);
	}

}
