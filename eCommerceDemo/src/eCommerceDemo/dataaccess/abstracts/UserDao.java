package eCommerceDemo.dataaccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {

	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public User get(int id);
	public List<User> getAll();
	public boolean isExist(String email);
}
