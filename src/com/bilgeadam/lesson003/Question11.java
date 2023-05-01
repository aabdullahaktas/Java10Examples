package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sayi,toplam=0;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Sayı Giriniz");
	    sayi =input.nextInt();
	    int i=1;
		while (i<=sayi) 
		{
	    	toplam+=i;
	    	i++;
		}
	    System.out.println(toplam);
	}
	

}
