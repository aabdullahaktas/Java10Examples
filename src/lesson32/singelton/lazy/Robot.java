package lesson32.singelton.lazy;

public class Robot {
	
	private  static Robot instance;
	
	private Robot() {
		
	}
	
	// threadlarin aynı anda bu metoda girmesini engellemek için synchronized keywordunu kullanmak gerekir 
	// public synchronized static robot getRobot() bu sayede eğer Threadler üzerinde çalısıyorsak her defasında aynı nesneyi
	// uretmeyi garanti altına almış oluruz
	public synchronized static Robot getRobot() {
		if (instance == null) {
			instance = new Robot();
		}
		return instance;
	}
	
	public void calis() {
		System.out.println(hashCode()+" -->numaralı robot calışıyor");
	}
	
}
