package stepDefinations;





import java.io.IOException;

import cucumber.api.java.en.*;
import pageObject.HomePage;
import pageObject.SearchPage;
import utility.BaseClass;
import utility.SnapShots;



public class StepDefination1 extends BaseClass {
	BaseClass baseclass=new BaseClass();
	HomePage homepage=new HomePage();
	SearchPage searchpage=new SearchPage();
	SnapShots snap;


	    @Given("^Intialize the browser with chrome$")
	    public void intialize_the_browser_with_chrome() {
	       baseclass.setUp(); 
	    }

	    @Then("^read data from excel and send in search box$")
	    public void read_data_from_excel_and_send_in_search_box() throws IOException {
	        searchpage.searchInput();
	    }
	    @Then("^Click on the first result$")
	    public void click_on_the_first_result() {
	        searchpage.clickOnResult1();
	    }

	    @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) {
	        driver.get(strArg1);
	    }

	    @And("^Click on Search icon on homepage$")
	    public void click_on_search_icon_on_homepage() {
	        homepage.clickOnSearch();
	    }

	    @And("^Click on search button$")
	    public void click_on_search_button() {
	        searchpage.clickOnSearch();
	    }
	    
	    @And("^verify the heading is (.+) or not$")
	    public void verify_the_heading_is_or_not(String text) throws Throwable {
	    	snap=new SnapShots();
	        String actual=searchpage.getResultHeading();
	        if(text.equalsIgnoreCase(actual)) {
	        	snap.takeSnapShot("test 1 passed");
	        }
	        else {
	        	snap.takeSnapShot("test 1 failed");
	        }
	    }
	    
	    @Then("^terminate the browser$")
	    public void terminate_the_browser() {
	        baseclass.tearDown();
	    }

}
