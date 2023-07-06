package lesson011;

import java.util.Scanner;

public class Question51 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

	private static void menu() {
		// TODO Auto-generated method stub
		int kontrol = 0;
		do {
			System.out.println("==Hesap makinesi===\n");
			System.out.println("1-Topla");
			System.out.println("2-Çıkar");
			System.out.println("3-Çarp");
			System.out.println("4-Böl");
			System.out.println("0-Çıkış");
			System.out.println("Bir işlem Seçiniz");
			kontrol = Integer.parseInt(scanner.nextLine());
			switch (kontrol) {
			case 1:
				System.out.println("toplam==>"+topla2());
				break;
			case 2:
				System.out.println("cıkarma==>"+cıkarma());
				break;
			case 3:
				System.out.println("carpma==>"+carpma());
				break;
			case 4:
				System.out.println("bolme==>"+bolme());
				break;
			case 0:
				System.out.println("Çıkıs");
				break;
			default:
				System.out.println("yanlış bir seçim yaptınız tekrar deneyiniz");
				break;
			}
		} while (kontrol != 0);
	}

	private static double bolme() {
		String sayi="";
		double sonuc = 1;
		int sayac = 0;
		
		System.out.println("lütfen bir sayi giriniz");
		
		while(!(sayi = scanner.nextLine()).equals("=")) {
			sayac++;
			if (sayac==1) {
				sonuc=Double.parseDouble(sayi);
			}else {
			sonuc /=Double.parseDouble(sayi);
			}
			System.out.println("lütfen bir sayi giriniz");
		}
		return sonuc;
	}

	private static int carpma() {
		int carpim=1;
		String sayi = "";
		int toplam = 0;
		System.out.println("lütfen bir sayi giriniz");
		while (!(sayi = scanner.nextLine()).equals("=")) {
			toplam += Integer.parseInt(sayi);
			System.out.println("lütfen bir sayi giriniz");
			}
		
		return toplam;
	}

	private static int cıkarma() {
		String sayi="";
		int sonuc = 0;
		int sayac = 0;
		
		System.out.println("lütfen bir sayi giriniz");
		
		while(!(sayi = scanner.nextLine()).equals("=")) {
			sayac++;
			if (sayac==1) {
				sonuc=Integer.parseInt(sayi);
			}else {
			sonuc -=Integer.parseInt(sayi);
			}
			System.out.println("lütfen bir sayi giriniz");
		}
		return sonuc;
	}

	private static int topla() {
		String sayi = "";
		int toplam = 0;
		do {
			System.out.println("lütfen bir sayi giriniz");
			sayi = scanner.nextLine();
			if (!(sayi.equals("="))) {
				toplam += Integer.parseInt(sayi);
			}
		} while (sayi.equals("="));
		return toplam;
	}

	private static int topla2() {
		String sayi = "";
		int toplam = 0;
		System.out.println("lütfen bir sayi giriniz");
		while (!(sayi = scanner.nextLine()).equals("=")) {
			toplam += Integer.parseInt(sayi);
			System.out.println("lütfen bir sayi giriniz");

		}
		return toplam;
	}

}
