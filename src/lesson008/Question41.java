package lesson008;

public class Question41 {

	public static void main(String[] args) {
		int [] sayilar = {2,2,4,5,8,2,15,2,2};
		boolean kontrol =false;
		System.out.println(ikiKontrol(sayilar)); 
		System.out.println(ikiKontrol(sayilar,kontrol)); 
	}
	public static boolean ikiKontrol(int [] dizi) {
		for (int i = 1; i < dizi.length; i++) {
			if(dizi[i] == 2 && dizi[i-1] == 2) {
				return true;
			}
		}
		return false;
	}
	// method overloading aşırı yukleme
	public static boolean ikiKontrol(int [] dizi,boolean kontrol) {
		for (int i = 1; i < dizi.length; i++) {
			if(dizi[i] == 2 && dizi[i-1] == 2) {
				kontrol =true;
				break;
			}
			else {
				kontrol=false;
			}
		}
		return false;
	}
}
