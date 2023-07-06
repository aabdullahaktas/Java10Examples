package lesson19.set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {
	
	Set<String> kategoriler = new HashSet<>(); 
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		SetOrnek setOrnek = new SetOrnek();
	//	setOrnek.kategoriEkle2();
		//setOrnek.kategoriEkle2();
		//setOrnek.kategoriEkle2();
		
		setOrnek.kategoriler.add("drama");
		setOrnek.kategoriler.add("anime");
		setOrnek.kategoriler.add("komedi");
		setOrnek.kategoriler.add("gerilim");
		
		
		for (String string : setOrnek.kategoriler) {
			System.out.println(string);
		}
	}
	
	public void kategoriEkle() {
		System.out.println("lutfenn kategori giriniz");
		String kategori = scanner.nextLine().toUpperCase();
		if (kategoriler.contains(kategori)) {
			System.out.println(kategori+" bu kategori daha once eklendi");
		}else {
			System.out.println(kategori+" bu kategori eklendi");
			kategoriler.add(kategori);
		}
	}
	
	public void kategoriEkle2() {
		System.out.println("lutfenn kategori giriniz");
		String kategori = scanner.nextLine().toUpperCase();
		if (!kategoriler.add(kategori)) {
			System.out.println(kategori+" bu kategori daha once eklendi");
		}else {
			System.out.println(kategori+" bu kategori eklendi");
		}
	}
}
