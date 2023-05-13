package pro;

import java.util.ArrayList;








public class Service 
{
	
	protected static ArrayList<String[]> servicess;
	protected String name;
	protected String description;
	protected String costofservice;
	protected boolean isAdded;
	protected boolean isDeleted;
	protected boolean isUpdated;
	
	public Service()
	{
	
		isAdded = false;
	}
	public void set( String name , String description , String costofservice )
	{
		this.name = name;
		this.description = description;
		this.costofservice = costofservice;
	}
	
	public boolean add(Admin admin)
	{
		isAdded = false;

		if ( admin.isLogged() )
		{
			String [] services = { this.name , this.description , this.costofservice};
			if ( servicess.add(services) )
				isAdded = true;
		}
		
		
		return isAdded;
	}
	
	
	public boolean isAdded()
	{
		return this.isAdded;
	}
	
	public boolean delete(Admin admin )
	{
		
		isDeleted = false;
		if ( admin.isLogged()) {
			 
				isDeleted = true;
			
		}
		 
		return isDeleted;
	}
	
	public boolean isDeleted()
	{
		return this.isDeleted;
	}
	
	
	
	
}