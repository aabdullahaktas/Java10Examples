package lesson014.kalıtım;

public class ElektrikPokemon extends Pokemon {
	
	int voltajSeviyesi;

	public ElektrikPokemon(String ad, int guc, int seviye, int can, String tur, int voltajSeviyesi) {
		super(ad, guc, seviye, can, tur);
		this.voltajSeviyesi = voltajSeviyesi;
		setTur("elektrik");
	}
	
	@Override
	public void saldir() {
		System.out.println(getAd()+"elektrik saldırısı");
	}

}
