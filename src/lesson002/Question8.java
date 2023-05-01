package lesson002;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vize,not;
		double ortalama;
		Scanner input = new Scanner(System.in);
		System.out.println("Vize Notunu Giriniz");
		vize = input.nextInt();
		System.out.println("Final Notunu Giriniz.");
		not= input.nextInt();
		System.out.println("Öğrenci Adı Giriniz.");
		input.nextLine();
		String ogrenciIsmi= input.nextLine();
		ortalama = (vize*0.4) + (not*0.6);
		System.out.print(ogrenciIsmi+" adlı Ogrenci ");
		System.out.print(ortalama<=60?"Geçti":"Kaldı");
		
	}

}
