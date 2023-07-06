package com.bilgeadam.ucakApp;

public class EkonomikYolcu extends Yolcu{


	static final int EKONOMI_FIYAT=100;
	
	
	public EkonomikYolcu(int id, String ad, String soyAd) {
		super(id, ad, soyAd);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void yolcuBilgileriniGetir() {
		// TODO Auto-generated method stub
		System.out.println("Ekonomi yolcu "+getAd()+"biletleri "+getBiletler());
	}


	@Override
	public void biletAl(EFirma firmaAdi) {
		int fiyat = BASE_FIYAT+EKONOMI_FIYAT;
		if (getBiletler().containsKey(firmaAdi.name())) {
			getBiletler().put(firmaAdi.name(), getBiletler().get((firmaAdi)) +fiyat);
			System.out.println(firmaAdi+" adlı fırmadan bir bilet daha alınmısıt"+getBiletler());
		}else {
			getBiletler().put(firmaAdi.name(),fiyat);
		}
		System.out.println(getAd()+" adlı yolcu"+firmaAdi+" için ekonomi sınıfında bilet almıstır"
		+ "Biletleriniz ==" +getBiletler());
		
	}





}
