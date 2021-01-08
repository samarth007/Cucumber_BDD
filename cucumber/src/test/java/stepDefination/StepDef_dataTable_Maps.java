package stepDefination;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_dataTable_Maps {

	@Given("^background given executed$")
	public void background_given_executed() throws Throwable {
	   
		System.out.println("back_given");
	}

	@When("^background when executed$")
	public void background_when_executed() throws Throwable {
	    
		System.out.println("when_executed");
	}
	
	@Given("^Users enter the details$")
	public void users_enter_the_details(DataTable arg1) {
	  
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	     List<Map<String, String>> li=  arg1.asMaps(String.class, String.class);
	     
	    
	     for(Map<String, String> m: li) {
	    	 
	    	 System.out.println(m.get("username"));
	    	 System.out.println(li.get(1));
	     }
	}   

	@When("^user click on the submit button$")
	public void user_click_on_the_submit_button() {
	    
		System.out.println("users clicks on submit button");
	}

	@Then("^Details are saved$")
	public void details_are_saved() {
	   
		System.out.println("details are saved");
	}
	
}
