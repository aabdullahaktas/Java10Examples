package lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam;
		Scanner  input = new Scanner(System.in);
		System.out.println("1. Sayıyı Giriniz.");
		int sayi1 = input.nextInt(); 
		System.out.println("2. Sayıyı Giriniz.");
		int sayi2 = input.nextInt();
		toplam=sayi1+sayi2;
		System.out.println(toplam%2==0?"Çift" : "Tek");
		
		
	}

}
