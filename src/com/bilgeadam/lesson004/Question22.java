package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		int kontrol = 0;
		int i= 2;
		while (i<sayi) {
			if(sayi % i==0) {
				kontrol++;
				}
			i++;
		}
		i++;
		if(kontrol == 0) {
			System.out.println("asaldır");
		}
		else {
			System.out.println("asal değildir");
		}
		
		
		
		
		
		
		
	}

}
