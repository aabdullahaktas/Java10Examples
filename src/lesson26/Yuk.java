package lesson26;

import java.time.LocalDate;

public class Yuk {
	
	private String isim;
	private double agırlık;
	private LocalDate kabulTarihi;
	
	
	public Yuk(String isim, double agırlık, LocalDate kabulTarihi) {
		super();
		this.isim = isim;
		this.agırlık = agırlık;
		this.kabulTarihi = kabulTarihi;
	}
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getAgırlık() {
		return agırlık;
	}
	public void setAgırlık(double agırlık) {
		this.agırlık = agırlık;
	}
	public LocalDate getKabulTarihi() {
		return kabulTarihi;
	}
	public void setKabulTarihi(LocalDate kabulTarihi) {
		this.kabulTarihi = kabulTarihi;
	}
	
	
	@Override
	public String toString() {
		return "Yuk [isim=" + isim + ", agırlık=" + agırlık + ", kabulTarihi=" + kabulTarihi + "]";
	}

	
	
	
	
	
	
}
