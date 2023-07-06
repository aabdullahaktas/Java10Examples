package lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileOrnek2 {
	
	List<Integer> icerik = new ArrayList<>();
	
	public static void main(String[] args) {
		FileOrnek2 fileOrnek2 = new FileOrnek2();
		fileOrnek2.dosyadanVeriOkuma("C:/Users/Asus/Desktop/Java10-Workspace/dosya/MicrosoftTeams-image.png");
		//fileOrnek2.icerik.remove(73);
		//fileOrnek2.dosyayaVeriYazdirma("C:/Users/Asus/Desktop/Java10-Workspace/dosya/kopya10.png");
		fileOrnek2.dosyayaVeriYazdirma("C:/Users/Asus/Desktop/Java10-Workspace/dosya/kopya.txt");
		//fileOrnek2.dosyayaVeriYazdirma("C:/Users/Asus/Desktop/Java10-Workspace/dosya/kopya.png");
		//fileOrnek2.dosyayaVeriYazdirma("C:/Users/Asus/Desktop/Java10-Workspace/dosya/kopya2.png");
		//fileOrnek2.dosyayaVeriYazdirma("C:/Users/Asus/Desktop/Java10-Workspace/dosya/kopya3.png");
		//fileOrnek2.dosyayaVeriYazdirma("C:/Users/Asus/Desktop/Java10-Workspace/dosya/kopya4.png");
	}
	public void dosyadanVeriOkuma(String dosyaYolu)  {
		try {
			FileInputStream fis = new FileInputStream(dosyaYolu);
			
			int deger;
			while ((deger=fis.read())!=-1) {
				System.out.print(deger+"-");
				icerik.add(deger);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dosyayaVeriYazdirma(String dosyaYolu) {
		try {
			FileOutputStream fos = new FileOutputStream(dosyaYolu);
			
			icerik.forEach(x->{
				try {
					fos.write(x);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			//for (Integer integer : icerik) {
				//fos.write(integer);
			//}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
