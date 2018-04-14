package domain;
import java.util.List;

import helper.Database;
import helper.Utils;


public class Client {
	
	//ArdaBatuhanDemir
	//12.04.2018
	
	private String companyName;
	private String companyAddress;
	private String companyEmail;
	private String contactName;
	private String contactEmail;
	private List<Campaign> campaigns;
	
	
	
	
	public Client()
	{
		super();
	}
	
	
	public Client(String companyName, String companyEmail, String contactName, String companyAddress) {
		super();
		this.companyName=companyName;
		this.companyEmail=companyEmail;
		this.contactName=contactName;
		this.companyAddress=companyAddress;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	
	public void getClients()
	{
        List<Client> clientList = Database.clientList;
		if(clientList.size() != 0) {
			for(int i=0; i< clientList.size(); i++) {
				Utils.print(String.valueOf(i) +" - "+ clientList.get(i).getCompanyName());
			}
			
		} else {
			Utils.print("Not Found Any Company at List..!");
		}
		
	}
	
	public void addNewCampaign(Campaign campaign)
	{
		this.campaigns.add(campaign);
	}
	
	public List<Campaign> getCampaigns()
	{
		return campaigns;
	}
	
	public void setCampaigns(List<Campaign> campaigns)
	{
		this.campaigns=campaigns;
	}
	

}
