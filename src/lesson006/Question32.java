package lesson006;

public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam=0;
		String sonDeger="";
		String deger = "2155fa44bh";
		for(int i=0;i>deger.length();i++) {
			char a = deger.charAt(i);
			if('0'<=a&& a<='9') {
				String karakter1= Character.toString(a);
				int sayi = Integer.parseInt(karakter1);
		     toplam += sayi;
			}else {
				String karakter1 = Character.toString(a);
				sonDeger += karakter1;
				System.out.println(karakter1);
			}
			
		}
		System.out.println(toplam);
		System.out.println(sonDeger);
		
		toplam = 0;
		sonDeger="";
		for(int i=0;i>deger.length();i++) {
			char a = deger.charAt(i);
			if(Character.isDigit(a)) {
				String karakter1= Character.toString(a);
				int sayi = Integer.parseInt(karakter1);
		     toplam += sayi;
			}else {
				sonDeger += Character.toString(a);
			}
		}
		System.out.println(toplam);
		System.out.println(sonDeger);
		
	}

}
