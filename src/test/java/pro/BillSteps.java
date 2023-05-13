package pro;



import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pro.Biil;
import pro.uses;


public class BillSteps {
	
	public static List<Map<String, String>> Bookings;
	public Biil b;
	public User p;
     
     
	@Given("these are bookings")
	public void these_are_bookings(io.cucumber.datatable.DataTable dataTable) {
	    
	    Bookings= dataTable.asMaps(String.class, String.class);
	    
	}

	@Given("there is the customer with ID {string}")
	public void there_is_the_customer_with_id(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    Biil.setpid(string);
	   
	}

	@Given("the customer come in time where Previously selected")
	public void the_customer_come_in_time_where_previously_selected() {
	    Biil.setcor(true);
	    Biil.find(Bookings);
	}

	@When("the customer pay his bill")
	public void the_customer_pay_his_bill() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Your bill is "+Biil.getbill());
	}

	@Then("the booking delete from Schedule table")
	public void the_booking_delete_from_schedule_table() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(Biil.getcor());
	}



	@Given("the customer not comming in his booktime")
	public void the_customer_not_comming_in_his_booktime() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("the bookdate has passed")
	public void the_bookdate_has_passed() {

	}

	@Then("the booking will deleted")
	public void the_booking_will_deleted() {
	   
	}
	
	
	

}

