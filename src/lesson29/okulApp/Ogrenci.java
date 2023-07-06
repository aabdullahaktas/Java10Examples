package lesson29.okulApp;

import java.io.Serializable;
import java.time.LocalDate;

public class Ogrenci implements Serializable{
	
	private String isim;
	private double ort;
	private EDurum durumu;
	private LocalDate dogumTarihi;
	
	public Ogrenci(String isim, double ort, LocalDate dogumTarihi) {
		super();
		this.isim = isim;
		this.ort = ort;
		this.dogumTarihi = dogumTarihi;
		durumBelirle(ort);

	}
	
	public Ogrenci(String isim, double ort, EDurum durumu, LocalDate dogumTarihi) {
		super();
		this.isim = isim;
		this.ort = ort;
		this.durumu=durumu;
		this.dogumTarihi = dogumTarihi;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getOrt() {
		return ort;
	}
	public void setOrt(double ort) {
		this.ort = ort;
	}
	public EDurum getDurumu() {
		return durumu;
	}
	public void setDurumu(EDurum durumu) {
		this.durumu = durumu;
	}
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public void durumBelirle(double ort) {
		if (ort<60) {
			this.durumu = EDurum.KALDI;
		}else {
			this.durumu =EDurum.GECTI;
		}
	}
	
	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ort=" + ort + ", durumu=" + durumu + ", dogumTarihi=" + dogumTarihi + "]";
	}
	
}
