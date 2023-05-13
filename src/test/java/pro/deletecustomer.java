package pro;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import pro.Admin;
import pro.Customer;

public class deletecustomer{
	Admin admin;
	Customer comp;
	
	public deletecustomer(Customer comp) {
		this.comp = comp;
		admin = new Admin("Haneen", "123");
	}
	
	@Given("admin is loginn")
	public void admin_is_loginn() {
		admin.login("Haneen","123");
	}

	@Given("i want to delete customer with name={string},phone={string},id={string},and city={string}")
	public void i_want_to_delete_customer_with_name_phone_username_and_city(String string, String string2, String string3, String string4) {
		 comp.setcomp("hadeel", "004594688","17", "Nablus");
	}

	@When("delete customer")
	public void delete_customer() {
	   comp.deletecustomer(comp);
	}

	@Then("delete done")
	public void delete_done() {
		assertEquals(false,comp.isaddthecust);
	}

	@Given("admin is not loginn")
	public void admin_is_not_loginn() {
	    admin.logout();
	}

	@Then("the {string} printf on screen")
	public void the_printf_on_screen(String string) {
		admin.logout();
		comp.isaddthecust=true;
		assertEquals(true,comp.isaddthecust);
		System.out.println("admin not login");
	}
}