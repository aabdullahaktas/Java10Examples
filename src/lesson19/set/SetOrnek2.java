package lesson19.set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * dısardan bir kelime girelim her harfini bir sete atmak istiyoruz 
 * tekrar edenleri bir sete tekrar etmeyenleri baska bir sete atalım 
 * sonra tekrar eden ve etmeyen setlerini yazdıralım
 * 
 */
public class SetOrnek2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen kelime giriniz");
		String kelime = scanner.nextLine();
		Set<Character> tekrarEden = new LinkedHashSet<>();
		Set<Character> tekrarEtmeyen = new LinkedHashSet<>();
		
		for (int i = 0; i < kelime.length(); i++) {
			if (!tekrarEden.contains(kelime.charAt(i))&&!tekrarEtmeyen.add(kelime.charAt(i))) {
				tekrarEden.add(kelime.charAt(i));
				tekrarEtmeyen.remove(kelime.charAt(i));
			}
			}
		System.out.println(tekrarEtmeyen);
		System.out.println(tekrarEden);
		
		
		
		for (int i = 0; i < tekrarEtmeyen.size(); i++) {
			System.out.println(tekrarEtmeyen.add(null));
		}
	}

	
}
