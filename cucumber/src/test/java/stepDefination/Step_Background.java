package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Background {

	
	@Given("^background given$")
	public void background_given() throws Throwable {
	    System.out.println("background given");
	}

	@When("^background when$")
	public void background_when() throws Throwable {
		 System.out.println("background when");
	}

	@Given("^scenario given excuted$")
	public void scenario_given_excuted() throws Throwable {
		 System.out.println("scenario given");
	}

	@When("^scenario when executed$")
	public void scenario_when_executed() throws Throwable {
		 System.out.println("scenario when");
	}

	@Then("^scenario then executed$")
	public void scenario_then_executed() throws Throwable {
		System.out.println("scenario then");
	}

	@Given("^scenarios given excuted$")
	public void scenarios_given_excuted() throws Throwable {
		System.out.println("scenarios given");
	}

	@When("^scenarios when executed$")
	public void scenarios_when_executed() throws Throwable {
		System.out.println("scenarios when");
	}

	@Then("^scenarios then executed$")
	public void scenarios_then_executed() throws Throwable {
		System.out.println("scenarios then");   
	}
}