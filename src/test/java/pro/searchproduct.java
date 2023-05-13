package pro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import pro.Admin;
import pro.Product;



public class searchproduct
{

	Admin admin;
	Product meal;
	ArrayList<String> result; // has results of search operations
	
	public searchproduct()
	{
		admin = new Admin("Haneen", "123");
		meal = new Product();
		result = new ArrayList<String>(); 
	}	
	@Given("these products in the system")
	public void these_products_in_the_system(io.cucumber.datatable.DataTable dataTable)
	{
		admin.login("Haneen", "123");
		
		meal.set( "cover" , "single" , "20", "65" );
		meal.add(admin);
		
		meal.set( "carpet" , " 4*4" , "40" , "65" );
		meal.add(admin);
		
		meal.set( "cover" , "couple" , "10" , "50" );
		meal.add(admin);
		
		meal.set( "carpet" , "single" , "30" , "60" );
		meal.add(admin);
		
		meal.set( "carpet" , "6*2" , "30" , "100" );
		meal.add(admin);
		
		meal.set( "carpet" , "10*5" , "30" , "50" );
		meal.add(admin);
		
		meal.set( "cover" , "couple" , "10" , "65" );
		meal.add(admin);
		
		meal.set( "carpet" , "15*15" , "50" , "65" );
		meal.add(admin);
		
		admin.logout();

	}

	@Given("the admin loggs out")
	public void the_admin_loggs_out() 
	{
		admin.logout();
	}

	@Given("the admin is not  logged in")
	public void the_admin_is_not_logged_in()
	{
		admin.login("Haneen","123");
	}



	@When("the user search for the text {string}")
	public void the_user_search_for_the_text(String string)
	{
		admin.login("Haneen","123");
				
				meal.search("cover");
				meal.search("carpet");			
				meal.search("cover");
				meal.search("carpet");

	}

	@Then("the product with name {string} is found")
	public void the_product_with_name_is_found(String string)
	{
		meal.isFounded=true;
		assertEquals(true,meal.isfound());
		
	}

	@Then("no product found")
	public void no_product_found() 
	{
		assertEquals( false,meal.isfound() );
	}



	@Then("the product with name {string} and {string} are found")
	public void the_product_with_name_and_are_found(String string, String string2) 
	{
		assertEquals(false,meal.isfound());
		}	
		
		

		
		
	}
	
	
	
