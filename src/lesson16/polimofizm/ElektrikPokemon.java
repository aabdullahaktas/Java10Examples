package lesson16.polimofizm;

public class ElektrikPokemon extends Pokemon {

	private int voltajSeviyesi;

	public ElektrikPokemon(int id, String ad, int guc, int can, int seviye, int voltajSeviyesi) {
		super(id, ad, guc, can, seviye);
		this.voltajSeviyesi = voltajSeviyesi;
		setTur("Elektrik");
	}

	public int getVoltajSeviyesi() {
		return voltajSeviyesi;
	}

	public void setVoltajSeviyesi(int voltajSeviyesi) {
		this.voltajSeviyesi = voltajSeviyesi;
	}

	@Override
	public void saldir() {
		System.out.println(getAd() + " adlı pokemon elektrik saldırısı yapıyor");
	}
}
