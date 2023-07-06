package lesson33.openclosed;

import lesson33.singleresponsibility.utility.Notification;
import lesson33.singleresponsibility.utility.User;

public abstract class SocialMedia {
	
	private double scaleRatio;
	
	public abstract void changeScaleRatio(String type);
	
	
	public double getScaleRatio() {
		return scaleRatio;
	}
	public void setScaleRatio(double scaleRatio) {
		this.scaleRatio = scaleRatio;
	}
	public void sendEmail(User user) {
		if (user.getEmail()!=null) {
			Notification.sendEmail(user.getEmail());
		}
	}
	public void sendSms(User user) {
		if (user.getPhone()!=null) {
			Notification.sendSms(user.getPhone());
		}
	}
	
	
}
