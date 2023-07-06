package lesson28;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File(FileSabitler.OGRENCI_LIST_FILE_COPY);
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
		File file2 = new File("C:/Users/Asus/Desktop/intellij-projects/Listeeee/dosya1.txt");
		
		try {
			System.out.println(file2.createNewFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(file2.delete());
//		System.out.println(file.exists());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.getTotalSpace());
//		System.out.println(file.getParent());
//		System.out.println(file.isDirectory()); // klasör mü 
//		System.out.println(file.lastModified());
//		System.out.println(file.length());
//		System.out.println(file.mkdirs());
//		System.out.println(file2.setReadable(false));
//		System.out.println(file2.canRead());
		
	}
}
