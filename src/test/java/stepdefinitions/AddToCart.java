package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.rtech.constants.ExcelUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart {
		 
	 @When("I enter valid details in top search box")
	 public void i_enter_in_top_search_box() throws IOException {
	     // Write code here that turns the phrase above into concrete actions
	     
		 List<Map<String, String>> reader  = ExcelUtils.getTestDetails("testing") ;
		 
		  for (int i =0 ; i<reader.size() ; i++)
		  {
			  System.out.print("value is "  + reader.get(i).get("username") + "  " + reader.get(i).get("password")); 
			  System.out.println("hi this s home ");
			  System.out.println();
		  }
		 
		 
	 }

	 
@Then("I see the homepage")
public void i_see_the_homepage() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("hi this s home ");
   
}

}


