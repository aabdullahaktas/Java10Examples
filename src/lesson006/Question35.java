package lesson006;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int [] numbers = new int [4];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("lütfen"+ i+"sayıyı giriniz.");
			numbers[i]= scan.nextInt();
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
	}

}
