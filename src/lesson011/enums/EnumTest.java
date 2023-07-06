package lesson011.enums;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EAylar haziran = EAylar.HAZIRAN; 
		
        // Stringe çevirme metotlari
		String haziranString = EAylar.HAZIRAN.toString();
		String haziranString2 = EAylar.HAZIRAN.name();
		
		System.out.println(haziran);
		System.out.println(haziranString);
		System.out.println(haziranString2);
		
		//Enumun sırasını bir int deger olarak alma yani indexini alma
		System.out.println(EAylar.HAZIRAN.ordinal());
		System.out.println(EAylar.TEMMUZ.ordinal());
		System.out.println(EAylar.AGUSTOS.ordinal());
		
		// bir stringi enuma cevirme
		String ay="temmuz".toUpperCase();
		
		EAylar enumAy = EAylar.valueOf(ay);
		System.out.println(enumAy);
		
		System.out.println("---------------------------");
		
		// bir enum yapısını arraya cevirme
		EAylar [] dizi=EAylar.values();
		for (EAylar ay1 : dizi) {
			System.out.println((ay1.ordinal()+1)+"--"+ay1.toString());
		}
		
		System.out.println(EAylar.HAZIRAN.gun);
		
		for (EAylar ay1 : dizi) {
			if(ay1.gun == 30&&ay1.mevsim.equalsIgnoreCase("yaz")) {
			System.out.println((ay1.ordinal()+1)+"--"+ay1.toString()+ay1.mevsimGetir());
			System.out.println(ay1.mevsimGetir());
		}
			}
		
		
	}

}
