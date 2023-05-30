package com.Service;

import com.Dao.FacebookuserDao;
import com.Dao.FacebookuserDaoInterface;
import com.FacebookUser.Facebookuser;

public class FacebookuserService implements FacebookuserServiceInterface {

	public int registeration(Facebookuser fb) {
		FacebookuserDaoInterface fd = new FacebookuserDao();
         return  fd.registrationDao(fb);
	}

}
