package lesson33.interfacesegregation;

import lesson33.singleresponsibility.utility.Notification;
import lesson33.singleresponsibility.utility.User;

public abstract class SocialMedia implements ISocialMedia{
	
	private double scaleRatio;
	
	public abstract void changeScaleRatio(String type);
	
	
	public double getScaleRatio() {
		return scaleRatio;
	}
	public void setScaleRatio(double scaleRatio) {
		this.scaleRatio = scaleRatio;
	}

	public abstract void sharePhoto();
	
	public abstract void chat();
	
	
}
