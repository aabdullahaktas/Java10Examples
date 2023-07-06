package lesson006;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String deger = "5156151313513135131";
		
		int toplam = 0;
		Long sayi1 = Long.parseLong(deger);
		Long basamak = 0L;
		
		while(sayi1>=1) {
			basamak = (sayi1%10);
			toplam += basamak;
			sayi1 /= 10;
		}
		System.out.println(toplam);
	}

}
