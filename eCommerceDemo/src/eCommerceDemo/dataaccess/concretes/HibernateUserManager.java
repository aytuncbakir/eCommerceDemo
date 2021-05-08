package eCommerceDemo.dataaccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataaccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserManager implements UserDao {

	private static List<User> users = new ArrayList<User>();
	@Override
	public void add(User user) {
		
		if(!isExist(user.getEmail())) {
			users.add(user);
			System.out.println("User added : "+ user.getFirstName()+" "+ user.getLastName());
		}else
			System.out.println("Email is in use, choose another email: "+ user.getEmail());
		

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExist(String email) {
		for(User user: users) {
			if(user.getEmail() == email)
				return true;
		}
		return false;
	}

}
