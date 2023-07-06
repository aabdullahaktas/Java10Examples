package lesson33.singleresponsibility;


import lesson33.singleresponsibility.utility.Notification;
import lesson33.singleresponsibility.utility.User;

/*
*  bir bildirim gonder metodu yazmanızı istioyrum
*  daha sonra eğer kullanıcın  emaili varsa email gonder
*  telefonu varsa sms gondersin hem telefon hem email varsa ikisinide gondersin
*  
*  bildirim gonder==> Kullanıcı
*  sms==>> 555-555-555 ==> sms gonderiliyor
*  email=> mustafa@gmail.com ==> email gonderiliyor
*
*
*/
public class Instagram {
	
	
	/*
	 * 1. basamakta bir sendNotification metodu yazdık
	 * kullanıcının telefon ve emailini kontrol edip ona göre bildirimler verdik.
	 * fakat bu metodun single responsibilitye uymadığını farkettik ve 2. basamağa geçtik...
	 * 
	 */
	public static void sendNotification(User user) {
		if (user.getEmail()!=null) {
			Notification.sendEmail(user.getEmail());
		}
		if (user.getPhone()!=null) {
			Notification.sendSms(user.getPhone());
		}
	}
	
	
	
	/*
	 * 
	 * 2. basamakta yukarıdaki metodu görevlerine göre 2 ye ayırıdk.
	 * 2 ayrı metot ile single responsibilitye uygun hale getirdik.
	 * 
	 */
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
