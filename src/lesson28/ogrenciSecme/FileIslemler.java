package lesson28.ogrenciSecme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 * Sabitlerimizi tuttugmuz bir sınıfımız olsun 
 * menudeki her bir işlem için bir metot yazalım 
 * System.out.println("1-Dosya yarat");
		System.out.println("2-Dosya sil");
		System.out.println("3-Dosya ya veri ekle");
		System.out.println("4-Dosya dan veri oku");
		System.out.println("5-Dosya da ki bir harfi değiştir");
		
	1-eger dosya daha once yaratılmamıssa dosya ismi ile beraber basarılı bir şekilde 
	olustuldugu cıktısını verelim eger daha once olusturulmussa bu dosaya daha once
	 olusturulmustr cıktısı verelim 	
 * 
 * 2- dosya sil metodu dha once bu dosya varsa silecek ve dosya basarı ile silinmiştir diyecek
 * eger dosya yoksa boyle bir dosya bulunumadı diye bir çıktı verecek
 * 3-  scanner ile alınan veriyi dosyaya yazdıralım 
 * 4- dosyadan okudugumuz veriyi bir stringe ekleyin 
 * ve strinde tutalım ve bu stringi geri donelim
 * 5-bir harf belirleyecğiz bu harf dosyamızda varsa 
 * ikinci belirlediğimiz harf ile değiştireceğiz
 *	dosyadada verinin değişmesini sağlayacagız
 */
public class FileIslemler {
	
	File file = new File(Sabitler.PATH);
	
	private void dosyaOlustur( ) {
		try {
			if (file.createNewFile()) {
				System.out.println(file.getName()+" basarılı olusturuldu");
			}else {
				System.out.println(file.getName()+" daha once olusturulmustur");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void dosyaSil( ) {
		try {
			if (file.delete()) {
				System.out.println(file.getName()+" basarılı bir sekilde silinmistir");
			}else {
				System.out.println(file.getName()+" daha once silinmiştir");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void dosyaVeriEkle( ) {
		String veri = Utility.stringDegerAlma("Lutfen veri girisi yapınız");
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))){
			if (file.length()!=0) {
				//bufferedWriter.newLine();
				veri = "\n"+veri;
			}
			bufferedWriter.write(veri);
			System.out.println(file.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String veriOku() {
		String metin = "";
		String satir = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
			while ((satir = bufferedReader.readLine()) != null) {
				if(metin.equals("")) {
					metin += satir;
				}else {
					metin += "\n"+ satir;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return metin;
	}
	
	private void harfDegistir() {
		String eskiHarf = Utility.stringDegerAlma("lutfen eski harfi giriniz");
		String yeniHarf = Utility.stringDegerAlma("lutfen yeni harfi giriniz");
		String metin = veriOku();
		metin = metin.replace(eskiHarf, yeniHarf);
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))){
			bufferedWriter.write(metin);
		} catch (IOException  e) {
			// TODO: handle exception
		}	
	}
	public static void menu() {
		System.out.println("-------DOSYA iŞLEMLERİ-----");
		System.out.println("1-Dosya Olustur");
		System.out.println("2-Dosyayı sil");
		System.out.println("3-Dosyaya veri ekle");
		System.out.println("4-Dosyadan veri oku");
		System.out.println("5-Dosyadaki bir harfi değiştir");
	}
	public void uygulama() {
		int secim=0;
		do {
			menu();
			secim = Utility.intDegerAlma("Lutfen bir islem seciniz");
			switch (secim) {
			case 1:
				dosyaOlustur();
				break;
			case 2:
				dosyaSil();
				break;
			case 3:
				dosyaVeriEkle();
				break;
			case 4:
				veriOku();
				break;
			case 5:
				harfDegistir();
				break;
			case 0:
				System.out.println("çıkış");
				break;

			default:
				break;
			}
		} while (secim != 0);
	}







	
}
