package Manager;

import data.User;
import interfaces.iUserManager;

public class UserManager implements iUserManager{
	VerificationManager verification;
    public UserManager(VerificationManager verification){
        this.verification=verification;
    }
    
    
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		if(verification.verify(user)){
            System.out.println(user.getNickName()+" Onaylandý ve eklendi");
        }
        else {
            System.out.println(user.getNickName()+"TC no hatalý!!! Lütfen tekrar deneyiniz");
        }
	}

	@Override
	public void updateUser(User user, int id, String firsName, String lastName, String nickName, String eMail,
			String nationalIdentity, String birthDay) {
		// TODO Auto-generated method stub
		String previousNickName=user.getNickName();
        user.setId(id);
        user.setFirstName(firsName);
        user.setLastName(lastName);
        user.setNationalIdentity(nationalIdentity);
        user.setNickName(nickName);
        user.setBirthDay(birthDay);
        System.out.println(previousNickName+" isimli oyuncu "+user.getNickName()+" olarak guncellendi");
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getNickName()+" Silindi");
	}

}
