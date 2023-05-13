package pro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import pro.Admin;
import pro.Customer;

public class addcustomer{
	Admin admin;
	Customer comp;
	
	public addcustomer(Customer comp) {
		this.comp = comp;
		admin = new Admin("Haneen", "123");
	}
	
	@Given("admin is login")
	public void admin_is_login() {
		admin.login("Haneen","123");
	}

	@Given("i want to add customer with name={string},phone={string},id={string},and city={string}")
	public void i_want_to_add_customer_with_name_phone_amount_and_type(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    comp.setcomp("hadeel", "004594688","17", "Nablus");
	}
	@When("add customer")
	public void add_customer() {
		comp.addcustomer(comp);
	}

	@Then("add done")
	public void add_done() {
		////assertEquals(comp.isaddthecomp, true);
		 assertTrue(comp.isaddthecust);
	}

	@Given("admin is not login")
	public void admin_is_not_login() {
	    admin.logout();
	}

	@Then("the {string} appear")
	public void the_appear(String string) {
		admin.logout();
		System.out.println("admin not login");
	}
	}


