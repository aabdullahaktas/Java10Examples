package lesson30.threadgiris;

public class Hesap {
	int bakiye = 10_000;
	
	public synchronized void paraYatir(int para) {
		bakiye+=para;
		System.out.println(Thread.currentThread().getName()+" ===> para yatırdı");
	}
	
	public synchronized void paraCek(int para) {
		if (bakiye>= para) {
			bakiye-=para;
			System.out.println(Thread.currentThread().getName()+" ===> para çekti");
		}else {
			System.out.println("yetersiz bakiye");
		}

	}
	
}
