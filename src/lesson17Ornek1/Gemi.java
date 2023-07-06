package lesson17Ornek1;

public abstract class Gemi extends Arac implements IDenizTasit{
	
	int odaSayisi;

	@Override
	public void yelkenAc() {
		System.out.println("yelken ac");
		
	}

	@Override
	public void limanaYanas() {
		System.out.println("limana yanas");
		
	}

	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName()+" hizlaniyor");
		hiz+=10;
		hizGoster();
	}

	@Override
	public void yavasla() {
		System.out.println(getClass().getSimpleName()+" yavasliyor");
		if (hiz>0) {
			hiz-=10;
			hizGoster();
		}

		
	}

}
