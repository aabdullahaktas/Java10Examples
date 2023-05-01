package lesson002;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Lütfen bir isim giriniz");
		String isim = input.nextLine();
		
		System.out.println("isim= "+isim);
		
		//toplu yorum satırı kısayolu ctrl shift c
		
		int sayi1=10;
		System.out.println("Lütfen bir sayı giriniz");
		int sayi2=input.nextInt();
		System.out.println("Lütfen bir sayı giriniz");
		double sayi3=input.nextDouble();
		//long sayi4=input.nextLong();
		//float sayi5=input.nextFloat();
		
		System.out.println("sonuc="+(sayi1+sayi2));
		
		// int(sayısal) degerden sonra bir string deger almak istersek mutlaka bos bir nextLine() kullanalım
		input.nextLine();
		System.out.println("Lütfen bir isim giriniz");
		String isim2=input.nextLine();
		System.out.println("isim2="+isim);
		
		System.out.println("Lütfen bir isim giriniz");
		isim2=input.nextLine();
		System.out.println("isim2="+isim);


	}

}
