package lesson21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {
	Map<Integer,Integer> map;
	List<Integer> list;
	Set<Integer> set;
	
	public SansliNumaralar() {
		map = new HashMap();
		list = new ArrayList<>();
		set = new TreeSet<>();
	}
	
	public void mapOlustur() {
		Random random = new Random();
		
		for (int i = 0; i < 10_000; i++) {
			int sayi = random.nextInt(1,101);
			if (!map.containsKey(sayi)) {
				map.put(sayi, 1);
			}else {
				map.replace(sayi, map.get(sayi)+1);
			}
		}
	}
	
	public void listeOlustur() {
		for (Integer key : map.keySet()) {
			int value= map.get(key);
			for (int i = 0; i < value; i++) {
				list.add(key);
			}
		}
	}
	
	public void sansliNumralariBul() { 
		Random random = new Random();
		Collections.shuffle(list);
		int count=0;
		while (set.size() < 10) {
			count++;
			int index = random.nextInt(list.size());
			set.add(list.get(index));
		}
		System.out.println("dongu saysı= " +count);
//		for (int i = 0; i < 10; i++) {
//			int index = random.nextInt(list.size());
//			set.add(list.get(index));
//		}
	}
	
	
	
	

		

	
	
	
		
	/*	Random random = new Random();
		Map<Integer, Integer> sansliNumaralar = new HashMap<>();
		for (int i = 0; i < 10_000; i++) {
			int sayi = random.nextInt(1,101);
			if (!sansliNumaralar.containsKey(sayi)) {
				sansliNumaralar.put(sayi, 1);
			}else {
				sansliNumaralar.put(sayi, sansliNumaralar.get(sayi)+1);
			}
		}
		sansliNumaralar.forEach((k,v)->System.out.println(k+"="+v));*/
		
		
		
	

}
