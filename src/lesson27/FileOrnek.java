package lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek {
	public static void main(String[] args) {
		File file = new File("C:/Users/Asus/Desktop/Java10-Workspace/dosya/deneme2.txt");
		
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {

			//FileWriter fileWriter = new FileWriter("C:/Users/Asus/Desktop/Java10-Workspace/dosya/deneme.txt");
			//FileReader fileReader = new FileReader("C:/Users/Asus/Desktop/Java10-Workspace/dosya/deneme.txt");
			//fileWriter.write("Merhaba dunya");
			//fileWriter.flush();
			
			 fos= new FileOutputStream("C:/Users/Asus/Desktop/Java10-Workspace/dosya/deneme.txt",true);// ture degeri program her  //calıstıgında dosyayı  //sıfırlamaz var olan veriyi  //korur ve devamına //yazma islemi devam eder
			 
			//FileInputStream fis = new FileInputStream("C:/Users/Asus/Desktop/Java10-Workspace/dosya/deneme.txt");
			//fos.write(66); // karakter olarak yazdırır ASCII
			//fos.write(69);
			byte [] array = {101,80,85,66};
			//fos.write(array);
			//String kelime = "java";
			//fos.write(kelime.getBytes());
			
			// okuma islemi
			 fis = new FileInputStream("C:/Users/Asus/Desktop/Java10-Workspace/dosya/deneme.txt");
			// uzun yontem
			//int deger = fis.read();
			//System.out.print((char)deger);
			//System.out.print((char)fis.read());
			//System.out.print((char)fis.read());
			//System.out.println((char)fis.read());
			//System.out.print(fis.read());
			
			int deger;
			while ((deger = fis.read())!=-1) {
				System.out.print((char)deger);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
