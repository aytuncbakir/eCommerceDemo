package eCommerceDemo.utils.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.utils.abstracts.UtilsService;

public class UtilsManager implements UtilsService{
	
	
	public  boolean validateFirstName(String firstName) {
		if(firstName.length() >= 2) {
			return true;
		}
		System.out.println("Invalid firstName: "+ firstName);
		return false;
	}
	
	public  boolean validateLastName(String lastName) {
		if(lastName.length() >= 2) 
			return true;
			
		System.out.println("Invalid lastName: "+ lastName);
		return false;
	}
	
	public  boolean validateEmail(String email) {
	
		 
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
	
		Matcher matcher = pattern.matcher(email);
		System.out.println(email +" : "+ matcher.matches());
		
		boolean isValidated = matcher.matches();
		
		if(isValidated == false)
			System.out.println("Invalid email: "+ email);
		
		return isValidated;
	}
	
	public  boolean validatePassword(String password) {
		if(password.length() >= 6) 
			return true;
		
		System.out.println("Invalid password: "+ password);
		return false;
	}

}
