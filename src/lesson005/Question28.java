package lesson005;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.println("Lütfen kelime giriniz");
		String kelime = input.nextLine();
		int sayac=0;
        for (int i = 0; i <kelime.length() ; i++) {
        	if(kelime.charAt(i)=='a'){
        		sayac++;
        	}
            }
    	System.out.println(sayac);
	}

}
