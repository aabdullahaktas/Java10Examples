package lesson33.liskovsubstitution;

import lesson33.singleresponsibility.utility.Notification;
import lesson33.singleresponsibility.utility.User;

public class Facebook extends SocialMedia implements IEmail,IPostable{

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(34);
		}else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(37);
			
		}else{
			setScaleRatio(45);
		}
		
	}

	public void sendEmail(User user) {
		if (user.getEmail()!=null) {
			Notification.sendEmail(user.getEmail());
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
	public void shareStory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		
	}


	
}
