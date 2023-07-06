package lesson010;

import java.util.Iterator;

public class Question45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start =2;
		int end =22;
		
		arrayYazdir(arrayOlustur(start,end));
	}
	
	private static String[] arrayOlustur(int start, int end) {
		// TODO Auto-generated method stub
		String [] array=new String[end-start+1];
		for (int i = 0; i < array.length; i++) {
			int eleman=start+i;
			if (eleman%15==0) {
				array[i]="bilgeadam";
			}else if(eleman%5==0){
				array[i]="adam";
			}else if(eleman%3==0) {
				array[i]="bilge";
			}else{
				array[i]= Integer.toString(eleman);
			}
		}
		return array;
	}
	public static void arrayYazdir(String [] dizi) {
		System.out.print("[");
		for (String deger : dizi) {
			System.out.print(deger+",");
		}
		System.out.print("]");

	}
}
