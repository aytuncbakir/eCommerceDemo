package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.UserVerificationNotification;
import eCommerceDemo.entities.concretes.User;

public class UserSmsVerificationNotification implements UserVerificationNotification{

	@Override
	public boolean sendUserVerification(User user) {
		if(user.getEmail().length() > 8 && user.getEmail().contains("@")) {
			System.out.println("User verified by Sms :" + user.getEmail());
			return true;
		}else 
			System.out.println("User verification failed");
		
		return false;
	}
}
