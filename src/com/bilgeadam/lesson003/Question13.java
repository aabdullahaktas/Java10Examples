package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Sayı Giriniz");
	    sayi =input.nextInt();
	    for(int i=1; i<=10;i++) 
	    {    

	    	System.out.println(i+"x"+sayi+"="+(i*sayi));
	    }

	}

}
