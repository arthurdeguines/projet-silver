package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import dao.abst.ClientDao;
import entity.ClientEntity;

public class ClientDaoImpl implements ClientDao{
	SessionFactory sessionFactory = new Configuration().configure()
            .buildSessionFactory();

    Session session = sessionFactory.openSession();
	
	public List<ClientEntity> getAllClients(){
		List<ClientEntity> result = session.createQuery("FROM ClientEntity").list();
		//query.setParameter("code", "7277");
		return result;
	}
}
