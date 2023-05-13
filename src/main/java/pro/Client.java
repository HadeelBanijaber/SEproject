package pro;

import java.util.ArrayList;
import java.util.List;

import pro.Client;



public class Client extends User 
{
	
	public static ArrayList<Client> Clients = new ArrayList<Client>();
	protected boolean isAdded;

	public List <String> Prodects = new ArrayList<String>();

	public Client() {
		isAdded = false;
		
	}

	public void set (String name,String username, String pass, String phonenumber, String city) {
		
		this.name = name;
		this.username=username;
		this.pass=pass;
		this.phonenumber=phonenumber;
		this.city = city;
	
	}
	
	
	public boolean register(Admin admin)
	{
		isAdded = false;

		if (admin.isLogged())
		{
			List<String> result = this.search(name);

			if (result.isEmpty() && Clients.add(this))
				isAdded = true;
			else
				GFG.print("the id is already exists");
	
		}
		else
		{
			GFG.print("/nthe admin must be logged in");
		}

		return isAdded;

	}
	

	public List<String> search(String id) 
	{
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < Clients.size(); i++) {
			Client c = Clients.get(i);

			if (c.get("id").indexOf(id) != -1)
				result.add(c.get("name"));
		}

		return result;
	}

	
	public boolean isAdded() {
		return this.isAdded;
	}

	public String get(String type)
	{
		if (type.equals("name"))
			return this.name;
		return this.name;
	
	}
	
	

}

