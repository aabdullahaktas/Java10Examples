package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int telefonKod,mailKod,a=25,b=25;
		System.out.println("Telefon gelen kodu giriniz");
		telefonKod = input.nextInt();
		System.out.println("Maile gelen kodu giriniz");
		mailKod = input.nextInt();
		if(telefonKod==a&& mailKod==b) {
			System.out.println("Sisteme Kayıt Oldunuz");
		}
		else if(telefonKod!=a && mailKod==b ){
			System.out.println("Telefon kodu hatalı.");
		}
		else if(mailKod!=b && telefonKod==a){
			System.out.println("Mail kodu hatalı.");
		}
		else {
			System.out.println("Telefon ve Mail Kodu Hatalı");
		}
	}

}
