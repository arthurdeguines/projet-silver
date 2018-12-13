package service.impl;

import java.util.List;

import javax.inject.Inject;

import dao.abst.ClientDao;
import dao.impl.ClientDaoImpl;
import entity.ClientEntity;
import service.abst.ClientService;

public class ClientServiceImpl implements ClientService{
	
	ClientDaoImpl clientDao = new ClientDaoImpl();

	@Override
	public List<ClientEntity> getAllClients() {
		return clientDao.getAllClients();
	}
}
