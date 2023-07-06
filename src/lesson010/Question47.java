package lesson010;
/*
 * Carpım tablosu bir arrayin içine toplayacağız 1 ile 10 arasındaki sayilar için geçerli
 * 1x1=1
 * 1x2=2
 * .
 * 1x10=10
 * 
 */
public class Question47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tabloYazdir(carpimTablosuOlustur());

	}
	public static String [][] carpimTablosuOlustur(){
		
		String [][] tablo= new String [10][10];
		
		for (int i = 0; i < tablo.length; i++) {
			for (int j = 0; j < tablo[i].length; j++) {
				tablo[i][j] = (i+1)+"x"+(j+1)+"="+((i+1)*(j+1));
			}
		}
		return tablo;
	}
	public static void tabloYazdir(String [][] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.println(dizi[i][j]);
			}
		}
	}
}
