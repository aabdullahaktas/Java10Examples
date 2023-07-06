package lesson006;

public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] sayilar = {1546,2,25,56,54,65,-454,78};
		int min = sayilar[0];        //Integer.MAX_VALUE;
		int max = sayilar[0];      //Integer.MIN_VALUE;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]>max) {
				max=sayilar[i];
			}
			if(sayilar[i]<min) {
				min=sayilar[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
