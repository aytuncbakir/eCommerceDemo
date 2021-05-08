package eCommerceDemo.facebookAuthentication;

import java.util.ArrayList;
import java.util.List;

public class SignUpWithFacebook {

public List<String> signUp(String email, String password) {
		
		List<String> userData = new ArrayList<String>();
		// suppose that email and password are true
		if(true) {
			System.out.println("User is a avaible gmail user: ");
			System.out.println(email +" "+ password);
			userData.add(email);
			userData.add(password);
			return userData;
		}
		
		return userData;
	}
}
