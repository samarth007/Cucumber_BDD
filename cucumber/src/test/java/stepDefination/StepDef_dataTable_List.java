package stepDefination;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;


public class StepDef_dataTable_List {

	
	@Given("^Users enter the details without columns$")
	public void users_enter_the_details_without_columns(DataTable arg1) throws Throwable {
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	  
		List<List<String>> li = arg1.asLists(String.class);
	 
		for(List<String> l : li) {
			System.out.println(l.get(1));
			System.out.println(li.get(1));
	}
	  
	}

	
	
}
