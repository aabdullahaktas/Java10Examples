package lesson007;

import java.util.Scanner;

public class Question38 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] dizi = {"Türkiye","Moğolistan","Japonya","Fransa","Danimarka"};
		Scanner scan = new Scanner(System.in);
		ulkeBul(dizi);
	}
	public static void ulkeBul(String []dizi){
		Scanner scan = new Scanner(System.in);
		System.out.println("ülke giriniz");
		String ulke = scan.nextLine();
		boolean kontrol = false;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals(ulke)){
				kontrol = true;
				break;
			}
		}
		if (kontrol) {
			System.out.println(ulke+"bulundu");
		}
		else {
			System.out.println(ulke+"bulunamadı");
		}
	}
	public static void ulkeBul2(String []dizi){
		Scanner scan = new Scanner(System.in);
		System.out.println("ülke giriniz");
		String ulke = scan.nextLine();
		String result = ulke + "Ülke bulunmadı";
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals(ulke)){
				result = ulke;
				break;
			}
		}
	}
	

	
	
	
	
	
	
	

}
