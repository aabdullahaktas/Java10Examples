package lesson014.kalıtım;

public class SuPokemon extends Pokemon{

	int yuzmeHizi;
	int suBasincGucu;
	
	public SuPokemon(String ad, int guc, int seviye, int can, String tur, int yuzmeHizi, int suBasincGucu) {
		super(ad, guc, seviye, can, tur);
		this.yuzmeHizi = yuzmeHizi;
		this.suBasincGucu = suBasincGucu;
		setTur("su");
	}
	
	public int getYuzmeHizi() {
		return yuzmeHizi;
	}
	public void setYuzmeHizi(int yuzmeHizi) {
		this.yuzmeHizi = yuzmeHizi;
	}
	public int getSuBasincGucu() {
		return suBasincGucu;
	}
	public void setSuBasincGucu(int suBasincGucu) {
		this.suBasincGucu = suBasincGucu;
	}
	
	@Override
	public void saldir() {
		System.out.println(getAd()+"su saldırısı yapıyor");
	}
	
	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yuzmehızı"+yuzmeHizi);
		System.out.println("basınc guzu"+suBasincGucu);
	}
	
	
}
