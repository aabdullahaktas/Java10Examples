package lesson17Ornek1;
/*
 * 
 * ucaklarda hız 50 ser artsın
 * gemilerde hiz 10 ar artsın
 * otomobil 20 
 * kamyon 5
 * 
 * 
 * 
 */
public abstract class Arac implements IHareket {
	
	int hiz;


	public abstract void hizlanma();

	public abstract void yavasla();
	
	public void hizGoster() {
		System.out.println("hiziniz " + hiz);
	}
	
}
