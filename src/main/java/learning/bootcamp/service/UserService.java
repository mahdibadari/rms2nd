package learning.bootcamp.service;

import learning.bootcamp.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}