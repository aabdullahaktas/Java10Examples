package lesson20;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * disarıdan bir kelime gireceğiz
 * merhaba
 * her bir harfin frekansını(kac kere geçtiği) bulacağız ve bir map yapısı içinde tutacağız
 * m=1
 * e=1
 * r=1
 * 
 * 
 */
public class MapOrnek3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kelime giriniz");
		String kelime=scanner.nextLine();
		Map<Character,Integer> map = new TreeMap<>();
		for (int i = 0; i < kelime.length(); i++) {
			char harf = kelime.charAt(i);
			if (!map.containsKey(harf)) {
				map.put(harf, 1);
			}else {
				map.put(harf, map.get(harf)+1);
			}
		}
		map.forEach((k,v)->System.out.println(k+"="+v));
	}

}
