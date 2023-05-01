package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi,toplam=0;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Sayı Giriniz");
	    sayi =input.nextInt();
	    for(int i=0; i<=sayi;i+=2)
	    {
	    	toplam+=i;
	    }
		System.out.println("toplam :"+toplam);
		
		toplam=0;
		for(int i=1;i<=sayi;i++) 
		{
			int a=i%2==0?i:0;
			toplam+=a;
			
		}
		System.out.println("toplam :"+toplam);
	}
}
