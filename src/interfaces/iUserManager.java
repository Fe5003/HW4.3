package interfaces;

import data.User;


public interface iUserManager {
	void add(User user);
	void updateUser(User user, int id, String firsName, String lastName, String nickName,
					String eMail, String nationalIdentity, String birthDay);
	void deleteUser(User user);
}
