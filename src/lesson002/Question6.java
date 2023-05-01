package lesson002;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14f;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dairenin Yarıçapını Giriniz :");
		int r = input.nextInt();
		System.out.println("Dairenin Cevresi: "+(2*pi*r));
		System.out.println("Dairenin Alanı: "+(pi*r*r));
		
		

		
		
	}

}
