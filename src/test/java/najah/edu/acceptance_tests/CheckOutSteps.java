
package najah.edu.acceptance_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.Checkout;

public class CheckOutSteps {
	int price,thepriceofapple;
	
	private Checkout checkout=new Checkout();
	@Given("the price of a {string} is {int}")
	public void the_price_of_a_is(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    price=int1.intValue();
	}



	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	   checkout.add(int1.intValue(),price);
	}
	@Then("the total price should be {int}")
	public void the_total_price_should_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(int1.intValue()==checkout.total());
	}

	@Given("the price of a {string} is {int} in B")
	public void the_price_of_a_is_INB(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		price=int1.intValue();
	}


	

	@When("I checkout {int} {string} in B")
	public void iCheckoutInB(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	
		   checkout.add(int1.intValue(),price);
	}
	@Then("the total price should be {int} in B")
	public void the_total_price_should_be_inB(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 assertTrue(int1.intValue()==checkout.total());
	}
	@Given("the price of a {string} is {int} in C")
	public void the_price_of_a_is_INC(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   if(string.equals("banana")) {
		price=int1.intValue();}
	   else {
		   thepriceofapple=int1.intValue();
	   }
	}




	@When("I checkout {int} {string} in C")
	public void iCheckoutInC(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		if(string.equals("banana")) {
		checkout.add(int1.intValue(),price);}
		else {
			checkout.add(int1.intValue(),thepriceofapple);
		}
	}
	@Then("the total price should be {int} in C")
	public void the_total_price_should_be_inC(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 assertTrue(int1.intValue()==checkout.total());
	}



}
