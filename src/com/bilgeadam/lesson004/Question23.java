package com.bilgeadam.lesson004;


public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String boyut="M"; // S-M-L-XL Pizza boyutları

		switch (boyut) {
		case "S":
			System.out.println("s boy");
			break;
		case "M":
			System.out.println("m boy");
			break;
		case "L":
			System.out.println("l boy");
			break;
		case "XL":
			System.out.println("xl boy");
			break;

		default:
			break;
		}
	}

}
