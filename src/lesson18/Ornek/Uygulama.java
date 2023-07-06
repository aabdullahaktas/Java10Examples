package lesson18.Ornek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Uygulama {
	
	ArrayList<Sehir> sehirler;
	
	public Uygulama() {
		this.sehirler = new ArrayList<>();
	}
	
	public void sehirOlustur() {
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			String isim = SehirDatabase.iller[i];
			Sehir sehir = new Sehir(isim);
			//sehir.setNufus(sehir.rastgeleNufusUret());
			sehir.plakaKoduUret(i+1);
			sehirler.add(sehir);
			
			
		}
	}
	
	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.sehirOlustur();
		System.out.println(uygulama.sehirler);
		
		Comparator<Sehir> nufusaGore = new Comparator<Sehir>() {
			@Override
			public int compare(Sehir o1, Sehir o2) {
				// TODO Auto-generated method stub
				return (int) (o2.getNufus() - o1.getNufus());
			}
		};
		
		Collections.sort(uygulama.sehirler,nufusaGore);
		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
		System.out.println("karısık liste");
		Collections.shuffle(uygulama.sehirler);
		
		Comparator<Sehir> ismeGore = new Comparator<Sehir>() {
			@Override
			public int compare(Sehir o1, Sehir o2) {
				// TODO Auto-generated method stub
				return o1.getIsim().compareTo(o2.getIsim());
			}
		};
		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}

	}
	
}
