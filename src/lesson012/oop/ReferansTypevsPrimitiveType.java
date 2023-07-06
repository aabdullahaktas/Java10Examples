package lesson012.oop;

public class ReferansTypevsPrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 4;
		a = b;
		b=12;
		System.out.println(a);
		System.out.println(b);

		String[] sehirler1 = {"Ankara", "İstanbul", "İzmir"};
		String[] sehirler2 = {"bursa", "konya", "mersin"};
		System.out.println(sehirler1[0]);
		System.out.println(sehirler1[1]);
	}

}
