package lesson007;

import java.util.Locale;

public class StringMetotlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value1= "Merhaba Dunyai";
		String value2= "nasıl";
		System.out.println(value1.length());
		System.out.println(value1.charAt(0));
		
		System.out.println(value1.concat(value2));
		
		System.out.println(value1.substring(0,5));// belli index aralığındakı degerleri almak için 
		System.out.println(value1.substring(7,9));
		System.out.println(value1.substring(4,value1.length()));
		//
		System.out.println(value1.contains("Mer"));
		System.out.println(value1.contains(" D"));
		
		
		String value4="Merhaba Dunya";
		String value5="Merhaba Dunya";
		String value6= new String ("Merhaba Dunya");
		String value7= new String ("Merhaba Dunya");
		System.out.println(value1.equals(value4));
		System.out.println(value1.equals(value5));
		System.out.println(value1.equalsIgnoreCase(value5));
		System.out.println(value1==value6);
		System.out.println(value1.equals(value6));
		System.out.println(value6==value7);
		System.out.println(value6.equals(value7));
		
		System.out.println(value7.hashCode());
		System.out.println(value6.hashCode());
		
		value7 = value6;
		System.out.println(value7==value6);
		
		value7 ="mustafa";
		System.out.println(value6);
		
		value6 ="xxx";
		System.out.println(value7);
		
		String value8 =value7+ "12";
		value8 +=5;
		System.out.println(value8);
		
		//Merhaba Dünya
		//bir karakterin kacıncı ındex oldugunu bulan 
		System.out.println(value1.indexOf("M"));
		System.out.println(value1.lastIndexOf("z"));
		
		//uppercase lowercase
		System.out.println(value1.toUpperCase());
		//value1= value1.toUpperCase();
		System.out.println(value1);
		System.out.println(value1.toLowerCase());
		System.out.println(value1.toLowerCase(Locale.ENGLISH));
		
		System.out.println(value1.substring(0,3).toUpperCase()+value1.substring(1));
		
		//raplace //değiştirme
		
		System.out.println(value1.replace('a', '@'));
		System.out.println(value1.replace("a", "@"));
		System.out.println(value1.replace("x", "@"));
		
		//StarstsWith endWitshs // ile baslıyor mu ile bitiyor mu
		System.out.println(value1.startsWith("M"));
		System.out.println(value1.startsWith("a"));
		System.out.println(value1.endsWith("i"));
		
		String value9= " xxx";
		System.out.println(value9.trim());
		
		// split
		String value10= "java,React,.Net,C";
		String [] dizi = value10.split(",");
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		System.out.println(dizi[0]);
		
		//
		char[] array = value10.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		
	}

}
