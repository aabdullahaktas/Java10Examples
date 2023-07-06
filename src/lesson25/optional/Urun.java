package lesson25.optional;

import java.time.LocalDate;

public class Urun {
	
	private String ad;
	private double fiyat;
	private LocalDate sonKullanmaTarihi;
	
	public Urun(String ad, double fiyat, LocalDate sonKullanmaTarihi) {
		super();
		this.ad = ad;
		this.fiyat = fiyat;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public LocalDate getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}
	public void setSonKullanmaTarihi(LocalDate sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}
	
	@Override
	public String toString() {
		return "Urun [ad=" + ad + ", fiyat=" + fiyat + ", sonKullanmaTarihi=" + sonKullanmaTarihi + "]";
	}
	
	
	

}
