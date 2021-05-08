package eCommerceDemo.core.abstracts;

import java.util.List;

public interface UserAuthenticationService {

	public List<String> signIn(String email, String password);
}
