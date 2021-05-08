package eCommerceDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.UserAuthenticationService;
import eCommerceDemo.core.abstracts.UserVerificationNotification;
import eCommerceDemo.dataaccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.utils.abstracts.UtilsService;


public class UserManager implements UserService {

	private UtilsService utilsService;
	private UserDao userDao;
	private UserAuthenticationService userAuthenticationService;
	private UserVerificationNotification userVerificationNotification;
	
	public UserManager(UtilsService utilsService,
			UserDao userDao, 
			UserAuthenticationService userAuthenticationService,
			UserVerificationNotification userVerificationNotification) {
		
		this.utilsService = utilsService;
		this.userDao = userDao;
		this.userAuthenticationService = userAuthenticationService;
		this.userVerificationNotification = userVerificationNotification;
	}

	@Override
	public void add(User user) {
		
		List<String> userData = userAuthenticationService.signIn(user.getEmail(), user.getPassword());
			
		if(userData.size() == 2) {
			
			boolean isEmailValid = utilsService.validateEmail(user.getEmail());
			boolean isPasswordValid =utilsService.validatePassword(user.getPassword());
			boolean isFirstNameValid =utilsService.validateFirstName(user.getFirstName());
			boolean isLastNameValid =utilsService.validateLastName(user.getLastName());
			if(isEmailValid && isPasswordValid && isFirstNameValid && isLastNameValid) {
				
				if(userVerificationNotification.sendUserVerification(user))
					userDao.add(user);
				
			}else {
				System.out.println("Check your datas");
			}
		}else {
			System.out.println("Invalid email or password");
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
