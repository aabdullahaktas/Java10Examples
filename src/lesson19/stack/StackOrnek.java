package lesson19.stack;

import java.util.Stack;

/*
 * LIFO == STACK YIĞIN ===> ilk giren son çıkar
 * 
 * 
 * Integer bir stack olusturup içine 6-7 adet deger ekleyelim
 * 
 *  100 den kucuk olan degerlerin toplamını bulalım
 *  100 den buyuk olanları baskabir stack yapısına aktaralım
 *  daha sonra yeni stağimizi yazdıralım   
 * 
 */
public class StackOrnek {
	public static void main(String[] args) {
		Stack<Integer> firstStackList = new Stack();
		Stack<Integer> LastStackList = new Stack();
		firstStackList.push(100);
		firstStackList.push(95);
		firstStackList.push(80);
		firstStackList.push(145);
		firstStackList.push(70);
		firstStackList.push(156);
		firstStackList.push(65); // int geri donus stack metodu 
		firstStackList.add(65); // boolean geri donus vector metodu 
		
		
		
		
		int toplam = 0;
		while (!firstStackList.isEmpty()) {
			int deger = firstStackList.peek(); // en üstteki veriye sadece bakar 
			if (deger<100) {
				toplam += firstStackList.pop(); // en üsteki veriyi çıkartır
			}else {
				LastStackList.push(firstStackList.pop());
			}
		}
		System.out.println("toplam"+ toplam);
		
		System.out.println("foreach");
		for (Integer integer : LastStackList) {
			System.out.println(integer);
		}
		
		
		System.out.println("while");
		while (!LastStackList.isEmpty()) {
			System.out.println(LastStackList.pop());
		}
		System.out.println(LastStackList.size());
		
		
		
		
		int sonuc = 0;
		for (Integer deger : firstStackList) {
			if (deger <100) {
				sonuc += deger;
			}else {
				LastStackList.add(deger);
			}
		}
		System.out.println(sonuc);
		System.out.println(LastStackList);
		System.out.println(firstStackList);
	}
}
