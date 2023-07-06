package lesson32.singelton;

public class Test {

	public static void main(String[] args) {
		MyPostgreConnection myPostgreConnection1 = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection2 = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection3 = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection4 = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection5 = MyPostgreConnection.getInstance();
		System.out.println(myPostgreConnection1);
		System.out.println(myPostgreConnection2);
		System.out.println(myPostgreConnection3);
		System.out.println(myPostgreConnection4);
		System.out.println(myPostgreConnection5);
		
		
	}
	
}
