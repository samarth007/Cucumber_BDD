package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1 {

	
	@Given("^given printed$")
	public void given_printed() throws Throwable {
	   
		System.out.println("given");
	}

	@When("^when printed$")
	public void when_printed() throws Throwable {
	  
		System.out.println("when");
	}

	@Then("^then printed$")
	public void then_printed() throws Throwable {
	    
		System.out.println("then");
	}
	
	@Given("^given(\\d+) printed$")
	public void given_printed(int arg1) throws Throwable {
	
		  System.out.println(arg1);
	}

	@When("^when(\\d+) printed$")
	public void when_printed(int arg1) throws Throwable {
	    
		System.out.println(arg1);
	}

	@Then("^then(\\d+) printed$")
	public void then_printed(int arg1) throws Throwable {
	
		System.out.println(arg1);
	
	}
	

}
