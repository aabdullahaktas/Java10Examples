package lesson26;

import java.util.Arrays;
import java.util.List;

public class Liman {
	
	private Yuk [] yukler;
	private int alanSayisi;
	
	
	public Liman(int alanSayisi) {
		super();
		this.alanSayisi = alanSayisi;
		this.yukler= new Yuk[alanSayisi];
	}
	public Liman() {
		this.alanSayisi = 10;
		yukler=new Yuk[alanSayisi];
	}

	public Yuk[] getYukler() {
		return yukler;
	}


	public void setYukler(Yuk[] yukler) {
		this.yukler = yukler;
	}


	public int getAlanSayisi() {
		return alanSayisi;
	}


	public void setAlanSayisi(int alanSayisi) {
		this.alanSayisi = alanSayisi;
	}


	@Override
	public String toString() {
		return "Liman [yukler=" + Arrays.toString(yukler) + ", alanSayisi=" + alanSayisi + "]";
	}
	
	
	
}
