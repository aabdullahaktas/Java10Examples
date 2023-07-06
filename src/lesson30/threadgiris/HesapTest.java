package lesson30.threadgiris;

public class HesapTest {
	public static void main(String[] args) {
		Hesap hesap = new Hesap();
		
		Thread thread1 = new Thread(()->{
			for (int i = 0; i < 20; i++) {
				hesap.paraCek(5000);
				System.out.println(hesap.bakiye);
			}
		});
		
		Thread thread2 = new Thread(()->{
			for (int i = 0; i < 20; i++) {
				hesap.paraYatir(5000);
				System.out.println(hesap.bakiye);
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("hesaptaki para: "+hesap.bakiye);
	}
}
