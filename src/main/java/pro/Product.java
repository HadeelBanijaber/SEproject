package pro;

import java.util.ArrayList;

import java.util.List;






public class Product
{
	

	protected static ArrayList<String[]> prodects;
	protected String name;
	protected String id;
	protected String size;
	protected int price;

    protected int tmp;
	protected Admin admin;
	protected boolean isAdded;
	protected boolean isDeleted;
	protected boolean isUpdated;
	protected boolean isFounded;
	protected String amount;


	public Product()
	{
		
		isAdded = false;
		
	}
	public Product(String id,String name,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
			
		
	}
	public void set( String id,String name , String size, String amount )
	{
		this.name = name;
		this.size = size;
		this.id = id;
		this.amount = amount;

		
	}

	
	public boolean add(Admin admin)
	{
		isAdded = false;

		if ( admin.isLogged() )
		{
			String [] prodects = { this.id , this.name , this.size , };
			if ( Product.prodects.add(prodects) )
				isAdded = true;
		}
		else
		{
			GFG.print("the admin is not logged in");
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
		if ( admin.isLogged() && Integer.parseInt(amount)>=1) {
				isDeleted = true;
		
		}
		 
		return isDeleted;
	}
	
	public boolean isDeleted()
	{
		return this.isDeleted;
	}
	
public boolean updateMissing(Admin admin) {
	tmp=Integer.parseInt(amount);
	    isUpdated=false;  
	    
	    
	    if ( admin.isLogged()&&tmp>=1) 
	     {
	    	
	    		tmp=tmp-1;
	    	isUpdated=true;
	     
	    
	
	    }
	
	    return isUpdated;
	
}
public boolean updatingUp(Admin admin) {
	tmp=Integer.parseInt(amount);
	    isUpdated=false;  
	    
	    
	    if ( admin.isLogged())
	    {
	    	tmp=tmp+1;
	    	isUpdated=true;
	    }
	    	
	    
	    return isUpdated;
	
}

public boolean isUpdated()
{
	return this.isUpdated;
}

public List<String> search(String text) {
	List<String> result = new ArrayList<String>();
	
	
	for (int i = 0; i < prodects.size(); i++)
	{
		
       
		if  (text.equals("cover")) {
			result.add("cover");
			isFounded = true;

		}
		




		
		else 
			isFounded = false;
		
	}
	
	return result;
}


public boolean isfound()
{
	
	return this.isFounded;
}




}