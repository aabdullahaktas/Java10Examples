package lesson011;

public class Question50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] turkceKarakter = {"İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö"};
		String [] ingilizceKarakter = {"I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O"};
		trToEng(turkceKarakter,ingilizceKarakter,"çaliş");
	}

	private static void trToEng(String[] turkceKarakter, String[] ingilizceKarakter,String ifade) {
		
		for (int i = 0; i < ingilizceKarakter.length; i++) {
			ifade = ifade.replaceAll(turkceKarakter[i], ingilizceKarakter[i]);
		}
		System.out.println(ifade);
	}
	private static void trToEng2(String[] turkceKarakter, String[] ingilizceKarakter,String ifade) {
		
		for (int i = 0; i < ingilizceKarakter.length; i++) {
			ifade = ifade.replaceAll(turkceKarakter[i], ingilizceKarakter[i]);
		}
		System.out.println(ifade);
	}

}
