package pro;

import java.util.ArrayList;

import java.util.List;

import pro.Customer;



public class Customer{
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
	
	  private List<Customer> customers= new ArrayList<Customer>();
	  
	  public void addcustomer(Customer c) {
		  customers.add(c);
		  isaddthecust =true;
		 
	  }
	  
	  public void deletecustomer(Customer c) {
		  customers.remove(c);
		  isaddthecust =false;
		 
	  }
	
	  public void updatePhoneCompany(Customer c,String phone) {
		  c.phone=phone;
		  isupdate =true;
		 
		 
	  }
	  
	  public void updateAmountCompany(Customer c) {
		  c.city=city;
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
