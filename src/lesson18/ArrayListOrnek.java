package lesson18;

import java.util.ArrayList;
import java.util.List;

/*
 * 1 tane liste olusturalım
 * 
 * Ankara
 * Bursa
 * Antalya
 * Artvin
 * Erzurum
 * Çanakkale
 * Karaman
 * 
 * an ile baslayan şehirleri silelim
 * 
 */
public class ArrayListOrnek {
	public static void main(String[] args) {
		List<String> sehirler = new ArrayList<>();
	    sehirler.add("Ankara");
	    sehirler.add("Antalya");
	    sehirler.add("Bursa");
	    sehirler.add("Artvin");
	    sehirler.add("Antalya");
	    sehirler.add("Antalya");
	    sehirler.add("Erzurum");
	    sehirler.add("Çanakkale");
	    sehirler.add("Karaman");
	    sehirler.add("Ankara");
	    sehirler.add("Ankara");

	 /*   for (int i = 0; i < sehirler.size(); i++) {
	    	System.out.println("liste boyutu ==" + sehirler.size());
			if (sehirler.get(i).startsWith("An")) {
				sehirler.remove(i);
				i--;
			}
		}
	    System.out.println(sehirler);*/
	    
	    
	  /*  for (int i = 0; i < sehirler.size(); i++) {
	    	System.out.println("liste boyutu ==" + sehirler.size());
			if (sehirler.get(i).startsWith("An")) {
				sehirler.remove(i);
				sehirler.add(i, "xxxx");
				
			}
		}
	    System.out.println(sehirler); */
	    
	    for (int i = 0; i < sehirler.size(); i++) {
	    	System.out.println("liste boyutu ==" + sehirler.size());
			if (sehirler.get(i).startsWith("An")) {
				sehirler.set(i, sehirler.get(i).replace("An", "xxx"));
			}
		}
	    System.out.println(sehirler); 
	    
	    
	}
}
