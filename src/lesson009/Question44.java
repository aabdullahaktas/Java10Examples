package lesson009;

public class Question44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		karakterSayici("Bugün güzel bir gün",'g');
	}
	public static int karakterSayici(String ifade,char karakter) {
		int sayac=0;
		for (int i = 0; i < ifade.length(); i++) {
			if(ifade.charAt(i)==karakter){
				sayac++;
			}
		}
		System.out.println(sayac);
		return sayac;
	}
}
