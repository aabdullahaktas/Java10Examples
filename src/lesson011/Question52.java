package lesson011;
/*
 * bir dizide 13 var ise ve bir sonra ki eleman toplama eklenmeden toplama sonucunu bulan kod
 * 
 */
public class Question52 {

	public static void main(String[] args) {
		int [] sayilar = {13,5,13,13,13,5,13};
		toplamBul(sayilar);
	}
	
	private static void toplamBul(int[] sayilar) {
		// TODO Auto-generated method stub
		int toplam = 0;
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == 13) {
				if(i+1<sayilar.length && sayilar[i+1]!=13) {
				i++;	
				}
			}else{
				toplam += sayilar[i];
			}
		}
		System.out.println(toplam);
	}
	private static void toplamBul2(int[] sayilar) {
		// TODO Auto-generated method stub
		int toplam = 0;
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == 13||(i>1&& sayilar[i-1] ==13)){
				continue;
			}else{
				toplam += sayilar[i];
			}
		}
		System.out.println(toplam);
	}

}
