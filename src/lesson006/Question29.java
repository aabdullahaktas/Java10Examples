package lesson006;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String deger = "1243";
		
		int toplam=0,toplam2=0,toplam3=0;
		
		for(int i=0;i<deger.length();i++) {
			// char dan stringe cevirme
			char a=deger.charAt(i);
			// ascı tablosu karsılıklarını toplar
			toplam3 += a ;
			
			// Stringden int e cevirme işlemi
			String karakter= String.valueOf(a);
			String karakter2 = Character.toString(a);
			int sayi = Integer.parseInt(karakter);
			
			// karakterden direk int e cevirme
			int sayi2 = Character.getNumericValue(a);
			toplam+=sayi;
			toplam2+=sayi2;
		}
		System.out.println(toplam);
		System.out.println(toplam2);
		System.out.println(toplam3);
	}

}
