package lesson010;

public class Question46 {

	public static void main(String[] args) {
		
		int [] sayilar = {1,4,5,6,1,1,4,8};
		sayiBulma(sayilar);
	}
	private static void sayiBulma(int [] dizi) {
		
		int birSayiAdedi=0,dortSayiAdedi=0;
		boolean kontrol = true;
		
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i] == 1) {
				birSayiAdedi++;
			}else if (dizi[i] ==4){
				dortSayiAdedi++;
			}
		}
		System.out.println("1 lerin adeti: " + birSayiAdedi);
		System.out.println("4 lerin adeti: " + dortSayiAdedi);
		if(birSayiAdedi>dortSayiAdedi) {
			System.out.println(kontrol);
		}else {
			kontrol=false;
			System.out.println(kontrol);
		}
	}
}
