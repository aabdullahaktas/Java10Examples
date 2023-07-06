package lesson18.Odev;

public abstract class Database {
	
	String username;
	String pasword;
	
	
	public abstract void veriEkle();
	public abstract void veriSil();
	public abstract void veriGuncelle();
	public abstract void verileriGetir();
	public abstract void login();
}
