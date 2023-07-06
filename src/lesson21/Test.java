package lesson21;

import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		sansliNumaralar.listeOlustur();
		sansliNumaralar.sansliNumralariBul();
//		sansliNumaralar.map.forEach((k,v)->System.out.println(k+"="+v));
		
//		for (Entry<Integer, Integer> deger : sansliNumaralar.map.entrySet()) {
//			System.out.println(deger.getKey()+"="+deger.getValue());
//		}
////		int toplam=0;
////		for (Integer key : sansliNumaralar.map.keySet()) {
////			System.out.println(key+"="+sansliNumaralar.map.get(key));
////			toplam+=sansliNumaralar.map.get(key);
////		}
////		System.out.println("toplam sayi miktari= " + toplam);
////		System.out.println(sansliNumaralar.list);
//		System.out.println("liste uxunlugu= "+ sansliNumaralar.list.size());
//		for (Integer sayi : sansliNumaralar.list) {
//			System.out.println(sayi);
//		}
		
		System.out.println("set uxunlugu= "+ sansliNumaralar.set.size());
		for (Integer sayi : sansliNumaralar.set) {
			System.out.println(sayi);
		}
		
		Set<Integer> numaralar=sansliNumaralar.set;
		System.out.println("-----------------------------");
		
		List<String> liste2 = new ArrayList<>();
		for (Integer integer : numaralar) {
			liste2.add("-"+integer+"-");
		}
		System.out.println(liste2);
		
		List<String> list = numaralar.stream().map(x-> "-"+x+"-").collect(Collectors.toList());
		System.out.println("----map----");
		numaralar.stream().map(x-> "-"+x+"-").forEach(System.out::println);		
		System.out.println("-----foreach------");
		numaralar.stream().forEach(x-> System.out.println("-"+x+"-"));
		
		
		//filter
		System.out.println("--------filter---------");
		for (Integer integer : numaralar) {
			if(integer >50) {
				System.out.println(integer);
			}
		}
		numaralar.stream().filter(x-> x>80).forEach(System.out::println);
		// filterda calıstıgım collections hangi turdeyse donen degerleri o turde bir yapıda toplayabilirim
		List<Integer> list3 = numaralar.stream().filter(x-> x>80).collect(Collectors.toList());
		
		numaralar.stream().filter(x-> {
			if(x%2==0) {
				return true;
			}else {
				return false;
			}
		}).forEach(System.out::println);
		System.out.println("---------");
		numaralar.stream().filter(x-> !(x%2==0)).forEach(System.out::println);
		
		numaralar.stream().filter(x->x<70).forEach(System.out::println);
		List<Integer> list4 = numaralar.stream().filter(x -> x < 70).map(x->x*2).collect(Collectors.toList());
		System.out.println(list4);
		numaralar.stream().filter(x -> x < 70).map(x->x*2).filter(x->x>90).forEach(System.out::println);
		
		//numaralar.stream().filter(x->x*2>70).forEach(System.out::println);
		
		
		int toplam1= numaralar.stream().filter(x -> x *2< 70).mapToInt(x->x).sum();
		int toplam2= numaralar.stream().filter(x -> x *2< 70).mapToInt(Integer::intValue).sum();
		
		// 2 ,5,10,8,5
		// 2+5=7
		// 7+10=17
		// 17+8=25
		// 25+5=30
		
		int toplam3= numaralar.stream().filter(x -> x *2< 70).reduce(0,(a, b)-> a+b);
		double bolum = numaralar.stream().filter(x->x*2<70).mapToDouble(x->x).reduce((a, b)->(a/b)).getAsDouble();
		
		double ortalama= numaralar.stream().filter(x -> x *2< 70).mapToInt(x->x).average().getAsDouble();
		
		double ortalama2= numaralar.stream().filter(x -> x *2< 70).collect(Collectors.averagingDouble(x->x));
		
		int min= numaralar.stream().mapToInt(x->x).min().getAsInt();
		int max= numaralar.stream().mapToInt(x->x).max().getAsInt();
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		int min2= numaralar.stream().min(Integer::compareTo).get();
		int max2= numaralar.stream().max(Integer::compareTo).get();
		System.out.println("max2: "+max2);
		System.out.println("min2: "+min2);
		
		System.out.println("toplam1: "+toplam1);
		System.out.println("toplam2: "+toplam2);
		System.out.println("toplam3: "+toplam3);
		System.out.println("ortalama: "+ ortalama);
		System.out.println("ortalama: "+ ortalama2);
		
		boolean kontrol1 =numaralar.stream().anyMatch(x->x>80 && x%2==0);
		boolean kontrol2 =numaralar.stream().allMatch(x->x>15);
		boolean kontrol3 =numaralar.stream().anyMatch(x->x>5);
		System.out.println(kontrol1);
		System.out.println(kontrol2);
		System.out.println(kontrol3);
		
		String deger = numaralar.stream().map(x->x.toString()).collect(Collectors.joining(","));
		System.out.println(deger);
		
		List<String> stringList=new ArrayList<>
		(List.of("Ankara", "Bolu","Van","Muş","İstanbul","Adana","Antalya","Mersin"));

		stringList.stream().filter(x->x.startsWith("A")).forEach(System.out::println);
		List<String> aIleBaslayanalar = stringList.stream().filter(x->x.startsWith("A")).
				collect(Collectors.toList());
		List<String> aIleBitenler = stringList.stream().filter(x->x.endsWith("a")).
				collect(Collectors.toList());
		System.out.println(aIleBitenler);
		stringList.stream().filter(x->x.length()<4).forEach(System.out::println);
		
		// groupingby kullanarak mapleme yapılıyorsa value degeri bir liste olacak
		Map<Integer, List<String>> map1 =stringList.stream().collect(Collectors.groupingBy(x->x.length()));
		Map<Integer, List<String>> map4 =stringList.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map1);
		System.out.println(map4);
		
		Map<Character, List<String>> map2 =stringList.stream().collect(Collectors.groupingBy(x->x.charAt(0)));
		Map<String, List<String>> map3 =stringList.stream().collect(Collectors.groupingBy(x->x.substring(0,1)));
		System.out.println(map2);
		System.out.println(map3);
		
		Map<String, Integer> map5=stringList.stream().collect(Collectors.toMap(x-> x, y-> y.length()));
		// sehire karsılık sehirin ilk 2 harfi gelecek sekilde mapleyelim
		Map<String, String> map6=stringList.stream().collect(Collectors.toMap(x->x,y->y.substring(0,2)));
		System.out.println(map5);
		System.out.println(map6);
		
		
		
		
		
	}
}
