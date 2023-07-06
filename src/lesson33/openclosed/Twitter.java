package lesson33.openclosed;

public class Twitter extends SocialMedia{

	@Override
	public void changeScaleRatio(String type) {
		if (type.equalsIgnoreCase("jpg")) {
			setScaleRatio(42);
		}else if (type.equalsIgnoreCase("png")) {
			setScaleRatio(48);
			
		}else{
			setScaleRatio(65);
		}
		
	}

}
