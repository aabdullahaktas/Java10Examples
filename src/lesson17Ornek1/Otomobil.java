package lesson17Ornek1;

public class Otomobil extends Arac implements IKaraTasit{

	@Override
	public void sur() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName()+" hizlaniyor");
		hiz+=20;
		hizGoster();
	}

	@Override
	public void yavasla() {
		System.out.println(getClass().getSimpleName()+" yavasliyor");
		if (hiz>0) {
			hiz-=20;
			hizGoster();
		}

		
	}
	

}
