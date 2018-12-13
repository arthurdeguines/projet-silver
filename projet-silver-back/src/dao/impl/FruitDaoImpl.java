package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.abst.FruitDao;
import entity.ClientEntity;
import entity.FruitEntity;

public class FruitDaoImpl implements FruitDao{
    
	SessionFactory sessionFactory = new Configuration().configure()
            .buildSessionFactory();

    Session session = sessionFactory.openSession();
	
	public List<FruitEntity> getAllFruits(){
		List<FruitEntity> result = session.createQuery("FROM FruitEntity").list();
		//query.setParameter("code", "7277");
		return result;
	}
}
