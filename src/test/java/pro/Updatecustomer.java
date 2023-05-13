package pro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import pro.Admin;
import pro.Customer;

public class Updatecustomer{
	Admin admin;
	Customer cust;
	
	public Updatecustomer(Customer cust) {
		this.cust = cust;
		admin = new Admin("Haneen", "123");
	}
	@Given("admin is loggin")
	public void admin_is_loggin() {
		admin.login("Haneen","123");
	}


	@Given("i want to update customer with name={string},phone={string},id={string},and city={string}")
	public void i_want_to_update_customer_with_name_phone_amount_and_type(String string, String string2, String string3, String string4) {
		 cust.setcomp("hadeel", "004594688","17", "Nablus");
	}

	@When("update phone number for customer")
	public void update_phone_number_for_customer() {
	   cust.updatePhoneCompany(cust,"0011856932");
	}

	@Then("update done")
	public void update_done() {
		 assertTrue(cust.isupdate);
	}
	@When("update city")
	public void update_city() {
	    cust.updateAmountCompany(cust );
	}
	
	@Given("admin is not loggin")
	public void admin_is_not_loggin() {
	    // Write code here that turns the phrase above into concrete actions
	 admin.logout();
	}

	@When("update customer")
	public void update_customer() {
		assertEquals(false,admin.isLogged());
		System.out.println("admin not login");
	}

}
