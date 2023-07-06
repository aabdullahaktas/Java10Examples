package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1=15,sayi2=15,sonuc;
		Scanner input = new Scanner(System.in);
		System.out.println("işlemi seçiniz +,-,*,/");
		String islem = input.nextLine();
		switch (islem) {
		case "+":
			sonuc =sayi1+sayi2;
			System.out.println(sonuc);
			break;
		case "-":
			sonuc =sayi1-sayi2;
			System.out.println(sonuc);
			break;
		case "*":
			sonuc =sayi1*sayi2;
			System.out.println(sonuc);
			break;
		case "/":
			sonuc =sayi1/sayi2;
			System.out.println(sonuc);
			break;

		default:
			System.out.println("islem yanlış seçildi");
			break;
		}
	}
}
