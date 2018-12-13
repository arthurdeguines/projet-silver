package com.projetsilver.jaxrs;

import java.io.IOException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import dao.impl.ClientDaoImpl;
import dao.impl.CommandeDaoImpl;
import dao.impl.FruitDaoImpl;
import entity.ClientEntity;
import entity.FruitEntity;
import service.abst.ClientService;
import service.impl.ClientServiceImpl;

@Path("/rest")
public class Routes {

	ClientServiceImpl clientService = new ClientServiceImpl();

	@GET
	@Path("/allClients")
	@Produces("application/json")
	public List<ClientEntity> getAllClients() {
		return clientService.getAllClients();
	}
	
	@GET
	@Path("/allFruits")
	@Produces("application/json")
	public String getFruits() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		FruitDaoImpl clientDao = new FruitDaoImpl();

		String result = mapper.writeValueAsString(clientDao.getAllFruits());
		return result;
	}
	
	@POST
	@Path("/createCommande/{idClient}/{idFruit}/{nombre}" )
	public void createCommande() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		CommandeDaoImpl commandeDao = new CommandeDaoImpl();
	}
}
