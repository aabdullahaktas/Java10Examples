package lesson16;

public class Musteri extends Kisi{
	private int alisverisPuani;

	public Musteri(String isim, String soyisim, String adres, String tel, int alisverisPuani) {
		super(isim, soyisim, adres, tel);
		this.alisverisPuani = alisverisPuani;
	}

	public int getAlisverisPuani() {
		return alisverisPuani;
	}

	public void setAlisverisPuani(int alisverisPuani) {
		this.alisverisPuani = alisverisPuani;
	}

	@Override
	public String toString() {
		return "Musteri [getAlisverisPuani()=" + getAlisverisPuani() + ", getIsim()=" + getIsim() + ", getSoyisim()="
				+ getSoyisim() + ", getAdres()=" + getAdres() + ", getTel()=" + getTel() + "]";
	}
	
}
