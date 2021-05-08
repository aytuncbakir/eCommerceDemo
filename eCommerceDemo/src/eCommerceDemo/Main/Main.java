package eCommerceDemo.Main;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.UserAuthenticatinManager;
import eCommerceDemo.core.concretes.UserSmsVerificationNotification;
import eCommerceDemo.dataaccess.concretes.HibernateUserManager;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.utils.concretes.UtilsManager;


public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(
								  new UtilsManager(),
								  new HibernateUserManager(), 
								  new UserAuthenticatinManager(), 
								  new UserSmsVerificationNotification()
								);


		User user = new User(1, "A", "Kara", "akara@gmail.com", "ak123464");
		//User user1 = new User(2, "Ahmet", "Atak", "akara@gmail.com", "at12334");
		
		userService.add(user);
		//userService.add(user1);
		
	}

}
