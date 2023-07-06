package com.bilgeadam.ucakApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Urun {
	private String urunAdi;
	private double urunFiyati;
	
	
	
	public Urun(String urunAdi, double urunFiyati) {
		super();
		this.urunAdi = urunAdi;
		this.urunFiyati = urunFiyati;
	}



	public String getUrunAdi() {
		return urunAdi;
	}



	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}



	public double getUrunFiyati() {
		return urunFiyati;
	}



	public void setUrunFiyati(double urunFiyati) {
		this.urunFiyati = urunFiyati;
	}



	@Override
	public String toString() {
		return "Urun [urunAdi=" + urunAdi + ", urunFiyati=" + urunFiyati + "]";
	}



	public static void main(String[] args) {
		List<Urun> urunler= new ArrayList<>(List.of(new Urun("sutas ayran", 30),new Urun("peynir", 200),
				new Urun("caykur", 150)));
		
		//urunler.stream().filter(x->x.getUrunFiyati()>100).collect(Collectors)
		
		
		
		
		
		
		
		
		
		
	}
}
