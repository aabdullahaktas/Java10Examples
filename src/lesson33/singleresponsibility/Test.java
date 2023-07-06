package lesson33.singleresponsibility;

import lesson33.singleresponsibility.utility.User;

public class Test {
	public static void main(String[] args) {
		Instagram instagram = new Instagram();
		User user = new User("Mustafa", "mustafa@gmail.com");
		User user2 = new User("Mustafa", "mustafa@gmail.com","555-555-555");
		
		//instagram.sendNotification(user2);
		
		instagram.sendEmail(user2);
		instagram.sendSms(user2);
	}
}
