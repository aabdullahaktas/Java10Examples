package lesson006;

public class Question36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] sayilar = {"4","6","5","12","13"};
		double tekToplam=0,ciftToplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			
			int sayi = Integer.parseInt(sayilar[i]);
			
			if(sayi%2==0) {
				ciftToplam+= sayi;
				
			}else {
				tekToplam+= sayi;
			}
		}
		double oran = tekToplam/ciftToplam;
		System.out.println(oran);
	}

}
