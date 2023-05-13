package pro;

import pro.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import pro.Admin;
import pro.Product;



public class addproduct
{
	Admin admin;
	Product p;
	
	public addproduct(Product p) {
		this.p = p;
		admin = new Admin("Haneen", "123");
	}
	
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() 
	{
		admin.login("Haneen","123");
		
	}

	@Given("there is a product with name {string} , type {string} , and the price {string}, amount {string}")
	public void there_is_a_product_with_name_type_and_the_price(String string, String string2, String string3, String string4)
	{
		p.set("cover", "single", "20", "2");
		
		
	}

	@When("the product is added to the system")
	public void the_product_is_added_to_the_system() 
	{
		p.add(admin);
	}

	@Then("the product with name {string} ,type {string} , and the price {string}, amount {string} inside the system")
	public void the_product_with_name_type_and_the_price_inside_the_system(String string, String string2, String string3, String string4) 
	{
		assertEquals( true,p.isAdded() );
	}

	@Given("that the admin is not logged in")
	public void that_the_admin_is_not_logged_in()
	{
		admin.logout();
	}

	
	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) 
	{
		admin.logout();
		assertEquals(false,p.add(admin));
		System.out.println("cant add because admin is not log in");
	}
	
}
