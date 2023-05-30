package com.Dao;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.FacebookUser.Facebookuser;

public class FacebookuserDao implements FacebookuserDaoInterface {

	public int registrationDao(Facebookuser fb) {
		int i=0;
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		EntityTransaction et = ss.getTransaction();
		et.begin();
		ss.save(fb);
		et.commit();
		i=1;
		return i;
	}

}
