package lesson27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek3 {
	public static void main(String[] args) {
		String path="C:/Users/Asus/Desktop/Java10-Workspace/dosya/deneme3.txt";
		File file = new File(path);
		BufferedReader bufferedReader;
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter;
		try {
			
			//file = new File(path);
			fileWriter = new FileWriter(path);
			bufferedWriter = new BufferedWriter(fileWriter);
			//bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write("deneme2");
			bufferedWriter.append("xyz",1,2); // substirng gibi indexler 
			bufferedWriter.write("deneme2\n");
			bufferedWriter.write("deneme2\n");
			bufferedWriter.write("abcd",1,2); // ilk  indexden itibaren 
			bufferedWriter.newLine();
			bufferedWriter.write("deneme2\n");
			bufferedWriter.flush();
			bufferedWriter.write("deneme2\n");
			
			// okuma işlemi 
			bufferedReader = new BufferedReader(new FileReader(file));
//			System.out.println((char)bufferedReader.read()); // buffred read ile fileinputstream frakı yok tek tek okurken 

//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
//			System.out.println(bufferedReader.readLine());
			
			//for (int i = 0; i < file.length(); i++) {
			//	System.out.println(bufferedReader.read());
			//}
			
			String deger=null;
			while ((deger=bufferedReader.readLine())!=null) {
				System.out.println(deger);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			try {
//				bufferedWriter.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
		
	}
}
