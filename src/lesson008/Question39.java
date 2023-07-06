package lesson008;

public class Question39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ifade = "Java,React,Spring,Google";
		
		ifadeAyirma(ifade);
		System.out.println();
		ifadeAyir(ifade);
		
		System.out.println(ifadeAyır(ifade)); 
		// void metotları print metodun içinde kulllanılmaz.
		//System.out.println(ifadeAyir(ifade)); 
		
	}

	public static String ifadeAyır(String ifade) {
		// TODO Auto-generated method stub
		System.out.println();
		ifade = ifade.replace(",", "\n");
		return ifade;
	}

	public static void ifadeAyir(String ifade) {
		// TODO Auto-generated method stub
		int index = 0;
		for (int i = 0; i < ifade.length(); i++) {
			if(ifade.charAt(i)== ',') {
				System.out.println(ifade.substring(index,i));
				index=i+1;
			}
		}
		System.out.println(ifade.substring(index));
	}

	public static void ifadeAyirma(String ifade) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < ifade.length(); i++) {
			if(ifade.charAt(i) == ',') {
				System.out.println();
			}
			else {
				System.out.print(ifade.charAt(i));
			}
		}
	}
}
