package lesson33.openclosed;

public class Test {
	public static void main(String[] args) {
		Instagram instagram = new Instagram();
		Facebook facebook = new Facebook();
		WhatsApp whatsApp = new WhatsApp();
		Twitter twitter = new Twitter();
		ResizePhoto resizePhoto = new ResizePhoto();
		
		
//		resizePhoto.resizePhoto2(instagram, "png");
//		System.out.println(instagram.getScaleRatio());
//		
//		resizePhoto.resizePhoto2(facebook, "jpeg");
//		System.out.println(facebook.getScaleRatio());
		
		resizePhoto.resize(facebook, "jpg");
		System.out.println(facebook.getScaleRatio());
		resizePhoto.resize(instagram, "jpg");
		System.out.println(instagram.getScaleRatio());
		resizePhoto.resize(whatsApp, "jpg");
		System.out.println(whatsApp.getScaleRatio());
		resizePhoto.resize(twitter, "jpg");
		System.out.println(twitter.getScaleRatio());
	}
}
