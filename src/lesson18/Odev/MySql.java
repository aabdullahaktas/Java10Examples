package lesson18.Odev;

public class MySql extends Database{

	@Override
	public void veriEkle() {
		System.out.println("MySql Veri tabanına veri eklendi");
		
	}

	@Override
	public void veriSil() {
		System.out.println("MySql Veri tabanına veri silindi");
		
	}

	@Override
	public void veriGuncelle() {
		System.out.println("MySql Veri tabanına veri güncellendi");
		
	}

	@Override
	public void verileriGetir() {
		System.out.println("MySql Veri tabanına veriler getirildi");
		
	}

	@Override
	public void login() {
		System.out.println("MySql Veri tabanına veri eklendi");
		
	}

}
