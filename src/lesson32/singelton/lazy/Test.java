package lesson32.singelton.lazy;
/*
* 1- 1 tane Robotumuz var bu robotun çalış metodu var
*     çalış metodunda==> hascode----> numaralı robot çalışıyor
* 2- Ev halkı sınıfımız olsun bu sınıfta Robot cagır metodu olsun
* bu metot çalısınca bize robot sınıfındaki çalış metodunu çalıstırsın
* ( ev halkı herdefasında aynı robotu çağırmalı)
* 3- Test sınıfında  3 tane ev halkı yaratarak bunu deneyeleim
*
*/
public class Test {
	public static void main(String[] args) {
		EvHalki anne = new EvHalki();
		EvHalki baba = new EvHalki();
		EvHalki cocuk = new EvHalki();
//		anne.robotCagir();
//      baba.robotCagir();
//		cocuk.robotCagir();
		anne.start();
		baba.start();
		cocuk.start();
		

		
	}

}
