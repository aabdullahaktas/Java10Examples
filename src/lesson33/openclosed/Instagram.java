package lesson33.openclosed;


import lesson33.singleresponsibility.utility.Notification;
import lesson33.singleresponsibility.utility.User;

/*
 * Open closed
*
*
*/
public class Instagram extends SocialMedia {

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


	

	

}
