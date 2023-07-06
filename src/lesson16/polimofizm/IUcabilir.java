package lesson16.polimofizm;

public interface IUcabilir {
	
	public static final String isim="abdullah";
	
	void havalan(String ad);
	void havalan();
	void inisYap();
	
	default void deneme() {
		int sayi = 5;
		System.out.println(sayi+"deneme");
	}
}
