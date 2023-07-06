package lesson014.kalıtım;

public class AtesPokemonu extends Pokemon{

	
	public AtesPokemonu(String ad, int guc, int seviye, int can, String tur, int yakicilikGucu) {
		super(ad, guc, seviye, can, tur);
		this.yakicilikGucu = yakicilikGucu;
		setTur("ates");
	}

	private int yakicilikGucu;
	
	public AtesPokemonu(int id, String ad, int guc, int seviye, int can, String tur, int yakicilikGucu) {
		super(id, ad, guc, seviye, can, tur);
		this.yakicilikGucu = yakicilikGucu;
	}

	public int getYakicilikGucu() {
		return yakicilikGucu;
	}

	public void setYakicilikGucu(int yakicilikGucu) {
		this.yakicilikGucu = yakicilikGucu;
	}
	@Override
	public void saldir() {
		System.out.println(getAd()+"ates saldırısı");
	}
	

}
