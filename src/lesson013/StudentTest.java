package lesson013;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.name ="mustafa";
		student1.kayıtEt();
		
		Student student2 = new Student();
		student1.name ="serkan";
		student1.kayıtEt();
		
		Student student3 = new Student();
		student1.name ="hilal";
		student1.kayıtEt();
		
		Student student4 = new Student();
		student1.name ="elif";
		
		System.out.println(student1.no);
		System.out.println(student2.no);
		System.out.println(student3.no);
		System.out.println("toplam kayıtlı ogrenci sayısı=="+Student.index);
		
		
		
		
		
		
		
	}

}
