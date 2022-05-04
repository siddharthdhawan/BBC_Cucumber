package stepDefinations;


import pageObject.HomePage;
import pageObject.SportsPage;
import utility.BaseClass;
import utility.SnapShots;
import cucumber.api.java.en.And;


public class StepDefination2 extends BaseClass {

		
		BaseClass baseclass=new BaseClass();
		HomePage homepage=new HomePage();
		SportsPage sportspage=new SportsPage();
		SnapShots snap;

	    @And("^Click on Sports button on homepage$")
	    public void click_on_sports_button_on_homepage() {
	        homepage.clickOnSports();
	    }

	    @And("^In sportspage verify the title$")
	    public void in_sportspage_verify_the_title() throws Throwable {
	    	snap=new SnapShots();
	        String text=sportspage.getHeading();
	        if(text.contains("Sport")) {
	        	snap.takeSnapShot("test 2 passed");
	        }
	        else {
	        	snap.takeSnapShot("test 2 Failed");
	        }
	    }

}
