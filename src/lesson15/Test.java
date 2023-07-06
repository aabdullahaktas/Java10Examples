package lesson15;

public class Test {
	public static void main(String[] args) {
		
		Anakart anakart= new Anakart();
		Klavye klavye = new Klavye();
		Ram ram = new Ram();
		Islemci islemci = new Islemci();
		Mouse mouse = new Mouse();
		

		
		Laptop laptop = new Laptop();
		
		DahiliDonanim [] dahiliDonanimlar = { ram, islemci};
		HariciDonanim [] hariciDonanimlar = { klavye, mouse};
		anakart.setDahiliDonanimlar(dahiliDonanimlar);
		
		laptop.setAd("my pc");
		laptop.setAnakart(anakart);
		laptop.setHariciDonanim(hariciDonanimlar);
		
		System.out.println(laptop);
		System.out.println(laptop.getAnakart().getDahiliDonanimlar()[0]);
		System.out.println(laptop.getAnakart().getDahiliDonanimlar()[1]);
	}
}
