package lesson33.dependencyinversion;

import lesson33.singleresponsibility.utility.User;

public interface ISms {
	void sendSms(User user);
}
