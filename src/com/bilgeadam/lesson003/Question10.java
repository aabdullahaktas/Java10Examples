package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int sayi;
		int toplam=0;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Sayı Giriniz");
	    sayi =input.nextInt();
	    for(int i=1; i<=sayi;i++) 
	    {
	    	toplam+=i;
	    }
	    System.out.println(toplam);
	    
	    
	    
	    


}
}