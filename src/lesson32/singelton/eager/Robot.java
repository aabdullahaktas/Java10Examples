package lesson32.singelton.eager;

public class Robot {
	
	private  static Robot instance = new Robot();
	
	private Robot() {
		
	}
	
	public  static Robot getRobot() {
		return instance;
	}
	
	public void calis() {
		System.out.println(hashCode()+" -->numaralı robot calışıyor");
	}
	
}
