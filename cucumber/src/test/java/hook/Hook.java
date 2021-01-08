package hook;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	@Before("@Smoke")
	public void before(Scenario sc) {
		System.out.println("before");
		System.out.println(sc.getName());
	}
	
	@After("@Smoke")
	public void after(Scenario sc) {
	   System.out.println("after");
	   System.out.println(sc.getName());
	}
	
	
	@Before()
	public void before_1(Scenario sc) {
		System.out.println(sc.getName());
		
	}
	
	@After()
	public void after_1(Scenario sc) {
		System.out.println(sc.getName());
	}
	
}
