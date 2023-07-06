package com.bilgeadam.ucakApp;

import java.util.Map;
import java.util.Random;

public abstract class Yolcu {
	
	private int id;
	private String ad;
	private String soyAd;
	private int koltukNo;
	private boolean checkin;
    static final int BASE_FIYAT=100;
    private Map<String, Integer> biletler;
    
    
	public Map<String, Integer> getBiletler() {
		return biletler;
	}

	public void setBiletler(Map<String, Integer> biletler) {
		this.biletler = biletler;
	}

	public Yolcu(int id, String ad, String soyAd) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyAd = soyAd;
		this.koltukNo=koltukNoUret();
		this.biletler=biletler;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyAd() {
		return soyAd;
	}
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}
	public boolean isCheckin() {
		return checkin;
	}
	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}
	public static int getBasefiyat() {
		return BASE_FIYAT;
	}
	
	public int koltukNoUret() {
		Random random = new Random();
		return random.nextInt(1,201);
	}
	 public abstract void yolcuBilgileriniGetir();
	 public abstract void biletAl(EFirma firmaAdi);
	 public void checkInYap() {
		 if (checkin) {
			 System.out.println(ad+" için zaten cekin yapılmıstır");
		}
		 else {
			System.out.println(ad+"check in yapılmıstır iyi ucuslar");
			this.checkin = true;
		}
	 }
	 
	 public void  uçağaBin() {
		 if (checkin) {
			System.out.println(ad+" "+ koltukNo+ "numaralı koltuga binebilirsiniz");
		}else {
			System.out.println();
		}
	 }
	
	
	
	
	
	@Override
	public String toString() {
		return "Yolcu [id=" + id + ", ad=" + ad + ", soyAd=" + soyAd + ", koltukNo=" + koltukNo + ", checkin=" + checkin
				+ "]";
	}	
	
	
}
