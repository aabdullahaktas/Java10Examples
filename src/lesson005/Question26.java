package lesson005;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sayi;
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		for (int i = 0; i<5; i++) {
			System.out.println("Sayi giriniz."+ (i+1));
			sayi = input.nextInt();
			if(sayi<=100&& sayi>=0) {
				if(sayi>max) {
					max=sayi;
				}
				if(sayi<min) {
					min=sayi;
				}
			}
			else {
				i--;
				System.out.println("Lütfen 0 ile 100 arası sayı giriniz");
			}
		}
		System.out.println("minimum sayi: "+min);
		System.out.println("maksimum sayi: "+max);

	}


}
