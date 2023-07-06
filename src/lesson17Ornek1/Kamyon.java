package lesson17Ornek1;

public class Kamyon extends Arac implements IKaraTasit , IYuk{
	
	int kasaUzunlugu;

	@Override
	public void sur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yukAl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yukBosalt() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName()+" hizlaniyor");
		hiz+=5;
		hizGoster();
	}

	@Override
	public void yavasla() {
		System.out.println(getClass().getSimpleName()+" yavasliyor");
		if (hiz>0) {
			hiz-=5;
			hizGoster();
		}

		
	}

}
