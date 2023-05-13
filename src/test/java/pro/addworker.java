package pro;
import pro.workers;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareproject.Doctors;

public class addworker {
	public static List<Map<String, String>> docData;

	
	
	@Given("These are the worker")
	public void these_are_the_worker(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		docData=  dataTable.asMaps(String.class, String.class);
	}

	@Given("that the user is logged in")
	public void that_the_user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("the user want to add worker with ID {string} , and name {string} , and w_specialty {string} , and w_phone {string}, and password {string} ,and city {string} ,and bill {string}")
	public void the_user_want_to_add_worker_with_id_and_name_and_w_specialty_and_w_phone_and_password_and_city_and_bill(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    workers.setdid(string);
	    workers.setname( string2);
	    workers.setss(string3);
	    workers.setphone(string4);
	    workers.setpass( string5);
	    workers.setcity( string6);
	    workers.setbill(string7);
	}

	@When("the worker is not exist before")
	public void the_worker_is_not_exist_before() {
	    // Write code here that turns the phrase above into concrete actions
		 Doctors.check(docData);
		   System.out.println( Doctors.getex());
	}

	/*@Given("the user want to add worker with ID {string}")
	public void the_user_want_to_add_worker_with_id(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 Doctors.setdid( string);
	}

	@When("the worker already exist")
	public void the_worker_already_exist() {
	    // Write code here that turns the phrase above into concrete actions
		 Doctors.check(docData);
		   System.out.println( Doctors.getex());
	}
	@Then("error message {string} is given")
	public void error_message_is_given(String string) {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue( Doctors.getex());
	    System.out.println(string);	
	    }*/
	
	@Then("the worker added")
	public void the_worker_added() {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse( Doctors.getex());
	}


}
