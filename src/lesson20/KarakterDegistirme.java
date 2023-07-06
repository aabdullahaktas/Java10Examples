package lesson20;
/*
* bu iki arraydan bir map olusturalım
* ve map uzerinde çalışalım
* dışarıdan girilen kelimen turkce karakteri varsa ingilizce karaktere cevireceğiz
*
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class KarakterDegistirme {


    public static void main(String[] args) {
        char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
        char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };
        
		Scanner scanner = new Scanner(System.in);

		Map<Character,Character> map = new HashMap<>();
		for (int i = 0; i < englishWords.length; i++) {
			map.put(turkishWords[i], englishWords[i]);
		}
		System.out.println("kelime giriniz");
		String kelime=scanner.nextLine();
		
		for (char c : map.keySet()) {
			if (kelime.contains(String.valueOf(c))) {
				kelime=kelime.replace(c, map.get(c));
			}
		}
		System.out.println("yeni hali= "+kelime);
	}
}
