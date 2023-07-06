package lesson009;

public class Question42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
