package eCommerceDemo.core.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserVerificationNotification {
	public boolean sendUserVerification(User user) ;
}
