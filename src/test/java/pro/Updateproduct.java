 package pro;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;

//import .;
import pro.Product;

public class Updateproduct{
	

	Admin admin;
	Product p;
	
	public Updateproduct(Product p){
		this.p = p;
		this.admin = new Admin("amo", "am444");
	}
	
	@Given("admin logged in")
	public void admin_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		admin.login("amo","am444");
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("a product  name {string} , type {string} , and the price {string}, amount\"{int}\"")
	public void a_product_name_type_and_the_price_amount(String string, String string2, String string3, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		p.set("cover", "single", "25","7");
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("the product is Update missing from the system")
	public void the_product_is_update_missing_from_the_system() {
	    // Write code here that turns the phrase above into concrete actions
		p.updateMissing(admin);
	  //  throw new io.cucumber.java.PendingException();
	}

	@Then("the product with name {string} ,type {string} , and the price {string}, amount\"{int}\" updated")
	public void the_product_with_name_type_and_the_price_amount_updated(String string, String string2, String string3, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		
		assertEquals( true,p.isUpdated() );
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("admin is not logged in")
	public void admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		admin.logout();
	   // throw new io.cucumber.java.PendingException();
	}
	

	@Then("the error messag missing {string} is appear")
	public void the_error_messag_missing_is_appear(String string) {
	    // Write code here that turns the phrase above into concrete actions
		admin.logout();
		assertEquals(false,p.updateMissing(admin));
		System.out.println("cant Update Missing because admin is not log in");
	  //  throw new io.cucumber.java.PendingException();
	}
	
	@When("the product is Updating up from the system")
	public void the_product_is_updating_up_from_the_system() {
	    // Write code here that turns the phrase above into concrete actions
		p.updatingUp(admin);
	  //  throw new io.cucumber.java.PendingException();
	}
	@Then("the error messag up {string} is appear")
	public void the_error_messag_up_is_appear(String string) {
	    // Write code here that turns the phrase above into concrete actions
		admin.logout();
		assertEquals(false,p.updateMissing(admin));
		System.out.println("cant Updating Up because admin is not log in");
	  //  throw new io.cucumber.java.PendingException();
	}
	
}