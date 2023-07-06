package lesson33.dependencyinversion;

import lesson33.singleresponsibility.utility.User;

public interface IEmail {

	void sendEmail(User user);
}
