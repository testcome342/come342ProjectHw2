package controller;

import domain.Campaign;
import domain.Client;
import helper.Database;
import helper.Utils;

public class AddNewClient {
	
	/*
	 * Arda Altunyay
	 * 14.04.2018
	 * */
	
	private static AddNewClient instance = new AddNewClient();
	
	public static AddNewClient getInstance() {
		
		return instance;
	}
	
	public AddNewClient() {
		
	}
	
	public int createNewClient(Client client) {
		Database.clientList.add(client);
		return client.getId();
	}
	
	public Campaign createNewCampaign() {
		
		return Campaign.createCampaign();
	}

}
