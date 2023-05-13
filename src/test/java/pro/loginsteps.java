package pro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

import pro.Admin;


public class loginsteps {
	
	Admin admin;
	String username;
	String password;
	
	public loginsteps()
	{
		admin = new Admin("amnaOth","am123");
	}
	

	@Given("the username is {string}")
	public void the_username_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		this.username="amnaOth";
	  
	}

	@Given("the password is {string}")
	public void the_password_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		this.password="am123";
	 
	}

	@Then("login is done")
	public void login_is_done() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals( true,admin.login(username, password));
	    
	}

	@Then("welcome")
	public void welcome() {
		assertEquals( true,admin.isLogged()  );
	   
	}

	@Then("login failed")
	public void login_failed() {
	    // Write code here that turns the phrase above into concrete actions
		this.username="amnaOth234";
		this.password = "am133jh";
		assertEquals( false,admin.login(username, password) );
	    
	}

	@Then("sorry")
	public void sorry() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals( false,admin.isLogged()  );
	   
	}


	
}

