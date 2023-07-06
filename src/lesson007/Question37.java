package lesson007;

public class Question37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] myDizi = new String[3];
		metot1();
		String deger = "Java";
		int sayi = 1;
		metot2(deger, sayi, myDizi);
		
		
		System.out.println("main metod :"+ myDizi[1]);

		System.out.println(topla());
		int result = topla();
		
		
		String isim = metot3();
		
		
		System.out.println(cikar(10,5));
		 
		int result2 = cikar(12,18);
		System.out.println(result2);
		
		
		String[] yenidizi= new String[3];
		diziOlustur(yenidizi);
		System.out.println(yenidizi[0]);
		
		
	}
	
	public static void metot1() {
		System.out.println("metot çalısıyor");
	} 
	
	public static void metot2(String kelime , int sayi ,String[] dizi) {
		dizi[sayi]=kelime;
		System.out.println(dizi[sayi]);
		System.out.println(sayi);
		System.out.println(dizi[sayi]);
	}
	
	// geri donuslu parametresiz
	public static int topla() {
		int sayi1=10;
		int sayi2=15;
		int sonuc = sayi1+sayi2;
		return sayi1+ sayi2;
	}
	
	public static String metot3() {
		return "mustafa";
	}
	
	// geri donuslu parametreli
	public static int cikar(int sayi1,int sayi2) {
		sayi1= sayi1/2;
		double sayi3=15;
		sayi1 = 2;
		sayi2 = 1;
		return (int)(sayi3 - sayi1 - sayi2);
	}
	
	public static String[] diziOlustur(String[] dizi) {
		dizi = new String[3];
		dizi[0]="html";
		dizi[1]="c+";
		dizi[2]="c";
		dizi[3]="java";
		
		return dizi;
	}
	
	
	
}
