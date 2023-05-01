package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Sayı Giriniz");
		int sayi = input.nextInt();

		int sayac= 0;
		int toplam = 0;
		
		do {
			sayac++;
		} while (sayi != 0);
		System.out.println("toplam="+sayi);
		System.out.println("basamak sayısı"+sayi);
	}
	
	

}
