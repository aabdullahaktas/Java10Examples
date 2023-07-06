package lesson29.okulApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * 
 */
public class Uygulama {
	public static void main(String[] args) {

		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(FileManager.path));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Ogretmen ogretmen1= new Ogretmen("berkin",bufferedReader);
		Ogretmen ogretmen2= new Ogretmen("mustafa",bufferedReader);
		ogretmen1.start();
		ogretmen2.start();
		
		ogretmen1.dosyaOlustur();
		ogretmen2.dosyaOlustur();
		
		try {
			ogretmen2.join();
			ogretmen2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ogretmen1.getIsim()+"="+ogretmen1.getOgrenciler().size());
		System.out.println(ogretmen2.getIsim()+"="+ogretmen2.getOgrenciler().size());
		
		System.out.println(ogretmen1.getIsim()+"="+ogretmen1.getOgrenciler());
		System.out.println(ogretmen2.getIsim()+"="+ogretmen2.getOgrenciler());
		
//		Ogretmen ogretmen = new Ogretmen("mustafa");
//		//dosyadanVeriOku("mustafa").forEach((System.out::println));
//		//ogretmen.notlariOku();
//		//ogretmen.getOgrenciler().forEach(System.out::println);
//		//ogretmen.dosyaOlustur();
//		
//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
//		
//		List<Ogrenci> list = ogretmen.getOgrenciler().stream().map(x->{
//			x.setOrt(x.getOrt()+5);
//			x.durumBelirle(x.getOrt());
//			return x;
//		}).collect(Collectors.toList());
//		
//		ogretmen.setOgrenciler(list);
//		ogretmen.getOgrenciler().forEach(System.out::println);
//		ogretmen.dosyaOlustur();
//		
//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
		
	}

}
