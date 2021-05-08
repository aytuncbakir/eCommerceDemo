package eCommerceDemo.core.concretes;

import java.util.List;

import eCommerceDemo.core.abstracts.UserAuthenticationService;
import eCommerceDemo.googleAuthentication.SignUpWithGoogle;

public class UserAuthenticatinManager implements UserAuthenticationService {

	@Override
	public List<String> signIn(String email, String password) {
		SignUpWithGoogle signUp = new SignUpWithGoogle();
		return signUp.signUp(email, password);
	}

}
