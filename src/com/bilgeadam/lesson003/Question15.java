package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int sayac=0;
	    int toplam =0;
	    int sayi=0;
	   
	    while(toplam<=50) 
	    {
	    	sayi++;
	    	toplam+=sayi;
	    	sayac++;
		    System.out.println("dongu toplam :"+toplam+"dongu sayısı :"+ sayac+"sayi :"+ sayi);
	    }
	    System.out.println("toplam:"+toplam);
	    System.out.println("sayac:"+sayac);
	    System.out.println("sayi: "+sayi);
	}

}
