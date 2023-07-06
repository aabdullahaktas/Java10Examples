package lesson29.okulApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class FileManager {
	static String file = "C:/Users/Asus/Desktop/intellij-projects/Listeeee/";
	static String path = file + "ogrenci.txt";
	
	public static List<Ogrenci> dosyadanVeriOku(String ogretmenIsmi,BufferedReader bufferedReader) {
		List<Ogrenci> list = new ArrayList<>();
		String veri="";
		try {
			while ((veri = bufferedReader.readLine())!= null) {
				String [] array = veri.split(",");
				String isim=array[0];
				List<String> notList = Arrays.asList(array).subList(1, 4);
				double ort = ortHesapla(notList);
				LocalDate date = Utility.formatliLocalDateCevirme(array[4], "dd/MM/yyyy");
				Ogrenci ogrenci = new Ogrenci(isim, ort, date);
				list.add(ogrenci);
				System.out.println(ogretmenIsmi+" adlı ogretmen=  "+ogrenci.getIsim()+" adlı ogrencinin notlarını okudu ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}

	private static double ortHesapla(List<String> notList) {
		return notList.stream().collect(Collectors.averagingDouble(x->Double.parseDouble(x)));
	}

	public static void ogretmenDosyasıOlustur(List<Ogrenci> ogrenciList,String isim){

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file+isim+".txt"))){
			oos.writeObject(ogrenciList);
			System.out.println("ogrenci ekleme işlemi basarılı");
		} catch (Exception e) {
			System.out.println(e.toString()+": ogrenci ekleme işlemi basarısız");
		}
		
	}
	
	public static List<Ogrenci> ogrencileriGetir(String isim) {
		List<Ogrenci> list = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file+isim+".txt"))){
			list = (List<Ogrenci>) ois.readObject();
			System.out.println("ogrenci getirme işlemi basarılı");
		} catch (Exception e) {
			System.out.println(e.toString()+": işlem basarısız");
		}
		return list;
	}
	
	



}
