package lesson19.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class RamazanPidesiKuyrugu {
	
	Queue<String> musteriler = new ArrayBlockingQueue<>(10);
	
	public static void main(String[] args) {
		
		RamazanPidesiKuyrugu ramazanPidesiKuyrugu = new RamazanPidesiKuyrugu();
		ramazanPidesiKuyrugu.musteriOlustur();
		ramazanPidesiKuyrugu.pideDagıt();
		ramazanPidesiKuyrugu.geriyeKalanlar();
		
	}
	
	public void musteriOlustur() {
		for (int i = 1; i < 11; i++) {
			musteriler.offer("Musteri "+ i);
		}
	}
	
	public void pideDagıt() {
		Random random =new Random();
		int pideSayisi = random.nextInt(1,13);
		System.out.println("pideler cıkıyor");
		System.out.println("pide sayisi= "+pideSayisi);
		for (int i = 1; i <= pideSayisi; i++) {
			if (!musteriler.isEmpty()) {
				System.out.println(musteriler.poll()+" pidesini aldı");
			}else {
				System.out.println("kalan pide sayisi= "+(pideSayisi -(i-1)));
				break;
			}
		}
	}
	
	public void geriyeKalanlar() {
		if (!musteriler.isEmpty()) {
			System.out.println("pide almayana kalmadı");
		}else {
			System.out.println("pide bitti pidesini almayanlar= ");
			for (String musteri : musteriler) {
				System.out.println(musteri);
			}
		}
	}
	
}
