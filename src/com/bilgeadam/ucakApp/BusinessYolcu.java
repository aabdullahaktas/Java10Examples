package com.bilgeadam.ucakApp;

public class BusinessYolcu extends Yolcu{
	

	static final int BUSINESS_FIYAT=200;
	static final int BUSINESSVIP_FIYAT=200;
	private boolean isVip;
	
	
	public BusinessYolcu(int id, String ad, String soyAd,boolean isVip) {
		super(id, ad, soyAd);
		this.isVip=isVip;
		// TODO Auto-generated constructor stub
	}


	public boolean isVip() {
		return isVip;
	}


	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}


	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Business Yolcu "+getAd()+"biletleri "+getBiletler());
		
	}


	@Override
	public void biletAl(EFirma firmaAdi) {
		int fiyat=0;
		String value="";
		if(isVip) {
			fiyat= BASE_FIYAT+BUSINESS_FIYAT+BUSINESSVIP_FIYAT;
			value="VIP";
		}else {
			fiyat= BASE_FIYAT+BUSINESS_FIYAT;
		}
		getBiletler().put(firmaAdi.name(),fiyat );
		System.out.println(getAd()+" adlı yolcu"+firmaAdi+" için"+value+" için bilet almıstır"
		+ "Biletleriniz ==" +getBiletler());
		
	}





}
