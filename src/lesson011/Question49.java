package lesson011;

public class Question49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+"07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya;100-Biga";
		
		yazdir(sehirler);
	}

	private static void yazdir(String sehirler) {
		// TODO Auto-generated method stub
		String [] dizi = sehirler.split(";");
		for (int i = 0; i < dizi.length; i++) {
			int index = dizi[i].indexOf("-");
			System.out.println(dizi[i].substring(index + 1)+"nın plaka kodu= "
			+ dizi[i].substring(0,index));
		}
	}

}
