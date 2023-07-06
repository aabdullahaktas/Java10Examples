package lesson19.stack;

import java.util.Scanner;
import java.util.Stack;

public class PalindromStack {

	static Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kelime giriniz");
		String kelime = scanner.nextLine();
		stackOlustur(kelime);
		System.out.println(stack);
		if(isPalindrom()) {
			System.out.println("palidrom");
		}else {
			System.out.println("palindrom değil");
		}
	}
	
	private static boolean isPalindrom() {
		
		for (int i = 0; i < stack.size()/2; i++) {
			if (stack.pop() != stack.get(i) ) {
				return false;
			}
		}
		return true;
	}
	
	private static void stackOlustur(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}
	}
}
