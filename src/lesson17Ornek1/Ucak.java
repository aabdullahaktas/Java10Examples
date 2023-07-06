package lesson17Ornek1;

public abstract class Ucak extends Arac implements IHavaTasiti{
	
	int kanatUzunlugu;

	@Override
	public void kalkisYap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inisYap() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName()+" hizlaniyor");
		hiz+=50;
		hizGoster();
	}

	@Override
	public void yavasla() {
		System.out.println(getClass().getSimpleName()+" yavasliyor");
		if (hiz>0) {
			hiz-=50;
			hizGoster();
		}

		
	}

}
