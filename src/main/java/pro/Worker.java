package pro;

import java.util.ArrayList;

import java.util.List;

import pro.Worker;


public class Worker{
	protected String name;
	protected String phone;
	protected String id;
	protected String city;
	protected boolean isaddthecust;
	protected boolean isadelete;
	protected boolean isupdate;
	
	
	public  void setcomp(String name,String phone,String id,String city)
	{
		this.name = name;
		this.phone = phone;
		this.id = id;
		this.city=city;
		this.isaddthecust=false;
		this.isupdate=false;
	}
	
	  private List<Worker> Workers= new ArrayList<Worker>();
	  
	  public void addcustomer(Worker w) {
		  Workers.add(w);
		  isaddthecust =true;
		 
	  }
	  
	  public void deletecustomer(Worker w) {
		  Workers.remove(w);
		  isaddthecust =false;
		 
	  }
	
	  public void updatePhoneCompany(Worker w,String phone) {
		  w.phone=phone;
		  isupdate =true;
		 
		 
	  }
	  
	  public void updateAmountCompany(Worker w ) {
		  w.city=city;
		  isupdate =true;
		  
		 
	  }
	
	  public boolean isaddthecom()
		{
			return this.isaddthecust;
		}
	  
	  
	  
	  public boolean isupdate()
		{
			return this.isupdate;
		}

	
	  
	  
}
