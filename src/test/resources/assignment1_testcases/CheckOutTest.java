package assignment1_testcases;

import static org.junit.Assert.assertTrue;

import assignment1.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutTest {
	int price;
	int priceapple;
	private Checkout checkout=new Checkout();
	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    price=int1.intValue();
	}



	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	   checkout.add(int1.intValue(),price);
	}
	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(int1.intValue()==checkout.total());
	}

	@Given("the price of a {string} is {int} in sc2")
	public void thePriceOfAIsInSc2(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		price=int1.intValue();
	}


	

	@When("I checkout {int} {string} in sc2")
	public void iCheckoutInSc2(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	
		   checkout.add(int1.intValue(),price);
	}
	@Then("the total price should be {int} in sc2")
	public void theTotalPriceShouldBeInSc2(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 assertTrue(int1.intValue()==checkout.total());
	}
	@Given("the price of a {string} is {int} in sc3")
	public void thePriceOfAIsInSc3(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   if(string.equals("banana")) {
		price=int1.intValue();}
	   else {
		   priceapple=int1.intValue();
	   }
	}




	@When("I checkout {int} {string} in sc3")
	public void iCheckoutInSc3(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
		if(string.equals("banana")) {
		checkout.add(int1.intValue(),price);}
		else {
			checkout.add(int1.intValue(),priceapple);
		}
	}
	@Then("the total price should be {int} in sc3")
	public void theTotalPriceShouldBeInSc3(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 assertTrue(int1.intValue()==checkout.total());
	}



}
