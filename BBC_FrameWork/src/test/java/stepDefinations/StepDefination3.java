package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.HomePage;
import pageObject.TermsPage;
import utility.SnapShots;

public class StepDefination3 {
	HomePage homepage=new HomePage();
	TermsPage termspage=new TermsPage();
	SnapShots snap;
    @Then("^Verify the first headinging$")
    public void verify_the_first_headinging() {
    	snap=new SnapShots();
       String pt=termspage.getTitle();
      if(pt.equalsIgnoreCase("Accessing the BBC")) {
    		snap.takeSnapShot("test 3 passed");
      }
      else {
      	snap.takeSnapShot("test 3 failed");
      }
    }

    @And("^Click on Terms of use$")
    public void click_on_terms_of_use() {
        homepage.clickOnTerms();
    }

}
