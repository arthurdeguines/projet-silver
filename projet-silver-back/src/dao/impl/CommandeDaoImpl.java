package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.abst.CommandeDao;
import entity.FruitEntity;

public class CommandeDaoImpl implements CommandeDao{
	SessionFactory sessionFactory = new Configuration().configure()
            .buildSessionFactory();

    Session session = sessionFactory.openSession();
	
	public void createCommande(){
		session.createQuery("FROM FruitEntity").list();
		//query.setParameter("code", "7277");
	}
}
