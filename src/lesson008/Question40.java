package lesson008;
import java.util.Scanner;
public class Question40 {
	public static void main(String[] args) {
		islem();
	}
	public static void menu() {
		System.out.println("--------String İşlemleri------------");
		System.out.println("1-Harf saydırma"); // dısaridan sring bir ifade ve hang
		System.out.println("2-Harf değistirme"); 
		System.out.println("3-Palindrom");
		System.out.println("4-Cıkış");
		System.out.println("Lütfen bir işlem seciniz");
	}
	public static void islem() {
		Scanner scanner = new Scanner(System.in);
		int islem;
        do {
        	menu();
		islem = scanner.nextInt();
		switch (islem) {
		case 1:
			System.out.println("1.işlem");
			harfSaydirma();
			break;
		case 2:
			System.out.println("2.işlem");
			harfDegistir();
			break;
		case 3:
			System.out.println("3.işlem");
			palindrom();
			break;
		case 4:
			System.out.println("Cıkıs Yapılıyor..");
			break;
		}
		}while (islem !=4);
	}
	public static void harfDegistir() {
		String ifade = stringDegerAl("Lütfen bir ifade giriniz");
		String eskiHarf = stringDegerAl("lütfen değistirilecek harfi giriniz");
		String yeniHarf = stringDegerAl("lütfen yeni harfi giriniz");
		System.out.println(ifade.replace(eskiHarf, yeniHarf));
		ifade = ifade .replace(eskiHarf,yeniHarf);
		System.out.println(ifade);
	}
	public static void harfSaydirma() {
		String ifade = stringDegerAl("Lütfen bir ifade giriniz");
		String harf = stringDegerAl("lütfen sayılmasını istedediğiniz harfi giriniz");
		char karakter = harf.charAt(0);
		int sayac=0;
		if (!ifade.contains(harf.substring(0,1))) {
			System.out.println("kelime harf icermiyor ");
			return;
		}
		for (int i = 0; i < ifade.length(); i++) {
			if(ifade.charAt(i)==karakter) {
				sayac++;
			}
		}
		System.out.println(ifade+"de"+ sayac + " kadar "+ harf.substring(0,1)+"'i iceriyor");
	}
	public static void palindrom() {
		String ifade = stringDegerAl("Lütfen bir ifade giriniz");
			boolean kontrol = false;
			for (int i = 0; i < ifade.length() / 2; i++) {
				if (ifade.charAt(i) != ifade.charAt(ifade.length() - 1 - i)) {
					kontrol = false;
				} else {
					kontrol = true;
				}
			}
			if (kontrol) {
				System.out.println("Bu palindrom ifadedir.");
			} else {
				System.out.println("Bu palindrom ifade değildir.");
			}
	}
	public static String stringDegerAl(String sorgu) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(sorgu);
		String ifade = scanner.nextLine();
		return ifade;
	}
}
