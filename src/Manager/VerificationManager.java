package Manager;

import data.User;
import interfaces.iVerificationManager;

public class VerificationManager implements iVerificationManager {

	@Override
	public boolean verify(User user) {
		if (user.getNationalIdentity().length()==11){
            return true;
        }
        else{
            return false;
        }
	
	}

}
