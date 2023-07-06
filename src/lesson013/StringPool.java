package lesson013;

public class StringPool {

	public static void main(String[] args) {
		
		String isim = "mustafa";
		String isim2 = "mustafa";
		
		
		System.out.println(isim == isim2);
		
		String isim3 = "mustafa ozturk";
		String isim4 = "mustafa ozturk";
		isim4 ="mustafa ozturk";
		isim4="serkan";
		
		String isim5 = "mustafa ozturk";
		
		//Stringler değiştirilimez (invitable) değişkenlerdir.
		
		isim4=isim5;
		System.out.println(isim4 == isim5);
		
		String isim6= new String("hilal");
		String isim7= new String("hilal");
		String isim8= new String("hilal");
		isim6 = isim8;
		isim7 = isim8;
		isim8 = "xxx";
		isim8 = new String("xxx");
		System.out.println(isim6 = isim7);
		System.out.println(isim7);
		String isim9 = "hilal";
		String isim10 = new String("hilal").intern();
		
		System.out.println(isim10==isim9);
		
		
		
		
		
		
		
		
	}

}
