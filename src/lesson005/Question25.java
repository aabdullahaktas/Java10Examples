package lesson005;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int toplam=0,sayac=1;
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = input.nextInt();
		for (int i = 1; i < sayi/2; i++) {
			if (sayi%i==0) {
				toplam += i;
			}
		}
			if (sayi ==toplam) {
				System.out.println(sayi+"mükemmel bir sayidır");
			}else {
				System.out.println(sayi+"mükemmel sayi değildir");
			}
		
	}

}
