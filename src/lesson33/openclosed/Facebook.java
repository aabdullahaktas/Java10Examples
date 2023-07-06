package lesson33.openclosed;

public class Facebook extends SocialMedia {

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

	
	
}
