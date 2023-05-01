package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    int faktoriyel=1;
	    int sayi =input.nextInt();
	    int i=1;
	    while(sayi>=i) 
	    {
	    	faktoriyel*=sayi;
	    	sayi--;
	    }
	    System.out.println(faktoriyel);

	}

}
