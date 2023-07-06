package lesson28;

import java.io.File;

public class Uygulama {
	public static void main(String[] args) {
		
		OgrenciFileIslemleri ogrenciFileIslemleri = new OgrenciFileIslemleri();
		//baslangcListeOlusturma(ogrenciFileIslemleri); // sıfırlama metodu 
		ogrenciFileIslemleri.dosyadanVeriOkuma(FileSabitler.OGRENCI_LIST_FILE_COPY);
		listedenOgrenciSecme(ogrenciFileIslemleri);
		

		
		
	}
	public static void baslangcListeOlusturma(OgrenciFileIslemleri ogrenciFileIslemleri) {
		
		ogrenciFileIslemleri.dosyadanVeriOkuma(FileSabitler.OGRENCI_LIST_FILE);
		//ogrenciFileIslemleri.ogrenciList.forEach(System.out::println);
		ogrenciFileIslemleri.listeyiDosyayaYazdirma(FileSabitler.OGRENCI_LIST_FILE_COPY);
		
	}
	public static void listeOlusturma(OgrenciFileIslemleri ogrenciFileIslemleri) {
		
		ogrenciFileIslemleri.dosyadanVeriOkuma(FileSabitler.OGRENCI_LIST_FILE);
		//ogrenciFileIslemleri.ogrenciList.forEach(System.out::println);
		ogrenciFileIslemleri.listeyiDosyayaYazdirma(FileSabitler.OGRENCI_LIST_FILE_COPY);
		
	}
	
	public static void listedenOgrenciSecme(OgrenciFileIslemleri ogrenciFileIslemleri) {
		
		if(ogrenciFileIslemleri.ogrenciList.isEmpty()) {
			System.out.println("secilecek ogrenci kalmadı");
			baslangcListeOlusturma(ogrenciFileIslemleri);
			File file = new File(FileSabitler.ALINAN_OGRENCI);
			file.delete();
		}else {
			int index = ogrenciFileIslemleri.ogrenciSec();
			ogrenciFileIslemleri.secilenOgrenciyiDosyayaYazdir(FileSabitler.ALINAN_OGRENCI, index);
			ogrenciFileIslemleri.ogrenciList.remove(index);
			ogrenciFileIslemleri.listeyiDosyayaYazdirma(FileSabitler.OGRENCI_LIST_FILE_COPY);
		}
	}
	
	
	
	
}
