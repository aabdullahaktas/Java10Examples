package lesson009;
public class Question43 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayiDizisi[] = {9, 5, 3,3, 18, 2, 0, 7};
		ilkTekrarEdenSayiyiBul(sayiDizisi);
	}
	public static void ilkTekrarEdenSayiyiBul(int [] dizi) {
		int sayac = 1;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i+1; j < dizi.length; j++) {
				if(dizi[i] == dizi[j]) {
					sayac++;
				}
			}
			if(sayac>1) {
				System.out.println("Tekrar eden sayımız "+dizi[i]);
				System.out.println("Tekrar sayımız "+ sayac);
				break;
			}
		}
		if(sayac==1) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		}
	}
	public static void ilkTekrarEdenSayiyiBul2(int [] dizi) {
		int sayac =0;
		Integer tekrarEdenSayi=null;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if(dizi[i]==dizi[j]) {
					tekrarEdenSayi=dizi[i];
					break;
				}
			}
			if(tekrarEdenSayi!=null) {
				break;
			}
		}if(tekrarEdenSayi==null){
			System.out.println("Tekrar eden sayi");
		}else {
			
		
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]== tekrarEdenSayi) {
				sayac++;
			}
		}		}		
		System.out.println("Tekrar eden sayımız "+tekrarEdenSayi);
		System.out.println("Tekrar sayımız "+ sayac);
			}
}
