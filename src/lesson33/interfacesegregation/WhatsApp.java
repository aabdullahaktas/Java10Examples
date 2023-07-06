package lesson33.interfacesegregation;

import lesson33.singleresponsibility.utility.Notification;
import lesson33.singleresponsibility.utility.User;

public class WhatsApp extends SocialMedia implements IEmail,ISms,IConferancable,IShareStorable {

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(28);
		}else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(32);
			
		}else{
			setScaleRatio(36);
		}
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
	@Override
	public void videoConferancing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void shareStory() {
		// TODO Auto-generated method stub
		
	}


	
	
}
