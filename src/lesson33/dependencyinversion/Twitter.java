package lesson33.dependencyinversion;

import lesson33.singleresponsibility.utility.User;

public class Twitter extends SocialMedia implements IEmail,ISms, ISocialMedia,IPostable{

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(15);
		}else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(25);
			
		}else{
			setScaleRatio(45);
		}
		
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
	public void sharePost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSms(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendEmail(User user) {
		// TODO Auto-generated method stub
		
	}

}
