package lesson19.stack;

import java.util.Random;
import java.util.Stack;

public class Manager {
	
	Stack<Tabak> temizler;
	Stack<Tabak> kirliler;
	public Manager() {
		this.kirliler=new Stack<>();
		this.temizler= new Stack<>();
	}
	
	
	public void tabakOlustur() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Tabak tabak = new Tabak(i + 1,random.nextBoolean());
			if (tabak.isKirliMi()) {
				kirliler.push(tabak);
			}
			else {
			temizler.push(tabak);
			}
		}
	}
	
	
	public void temizle() {
		if (kirliler.isEmpty()) {
			System.out.println("kirli tabak kalmamıştır");
			kullan();
		}else {
		Tabak tabak = kirliler.pop();
		tabak.setKirliMi(false);
		temizler.push(tabak);
		System.out.println(tabak.getId()+" idli tabak temizlenmiştir.");
		}
	}
	
	public void kullan() {
		if (temizler.isEmpty()) {
			System.out.println("temiz tabak kalmamıştır");
			temizle();
		}else {
		Tabak tabak = kirliler.pop();
		tabak.setKirliMi(true);
		kirliler.push(tabak);
		System.out.println(tabak.getId()+" idli tabak kullanılmısıtır.");
		}
	}
	
	public void secimYap(int secim) {
		switch (secim) {
		case 1: 
			temizle();
			break; 
		case 2: 
			kullan();
			break; 
		default:
		}
	}
}
