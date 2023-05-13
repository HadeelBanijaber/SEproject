package pro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



import pro.Admin;
import pro.Product;



public class deleteproduct 
{
	Admin admin;
	Product p;
	
	public  deleteproduct(Product product) {
		this.p = product;
		this.admin = new Admin("hadeel", "111");
	}
@Given("the admin is logged in")
public void the_admin_is_logged_in() {
	admin.login("hadeel","111");
	}
@Given("there is a product  name {string} , type {string} , and the price {string}, amount{string}")
public void there_is_a_product_name_type_and_the_price(String string, String string2, String string3, String string4)
{
	p.set("cover", "single", "20","1");
}

@When("the product is deleted from the system")
public void the_product_is_deleted_from_the_system() {
	p.delete(admin);
}

@Then("the product with name {string} ,type {string} , and the price {string}, amount{string} off the system")
public void the_product_with_name_type_and_the_price_off_the_system(String string, String string2, String string3, String string4) {
	}

@Given("the admin is not logged in")
public void the_admin_is_not_logged_in() {
	admin.logout();
}

@Then("the error messag {string} is given")
public void the_error_messag_is_given(String string) 
{
	admin.logout();
	
	System.out.println("cant delete because admin is not log in");
}

}












