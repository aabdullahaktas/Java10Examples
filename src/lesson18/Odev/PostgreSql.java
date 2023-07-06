package lesson18.Odev;

public class PostgreSql extends Database{
	@Override
	public void veriEkle() {
		System.out.println("PostgreSql Veri tabanına veri eklendi");
		
	}

	@Override
	public void veriSil() {
		System.out.println("PostgreSql Veri tabanına veri silindi");
		
	}

	@Override
	public void veriGuncelle() {
		System.out.println("PostgreSql Veri tabanına veri güncellendi");
		
	}

	@Override
	public void verileriGetir() {
		System.out.println("PostgreSql Veri tabanına veriler getirildi");
		
	}

	@Override
	public void login() {
		System.out.println("PostgreSql Veri tabanına veri eklendi");
		
	}
}
