package lesson33.dependencyinversion;

import lesson33.singleresponsibility.utility.Notification;
import lesson33.singleresponsibility.utility.User;

public class Instagram extends SocialMedia implements IEmail,ISms,IPostable,IShareStorable{

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(38);
		}else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(30);
			
		}else{
			setScaleRatio(40);
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
	public void sharePost() {
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
