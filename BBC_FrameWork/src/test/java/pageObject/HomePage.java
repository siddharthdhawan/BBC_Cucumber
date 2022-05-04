package pageObject;

import org.apache.logging.log4j.Logger;


import reusuable.WebDriverHelper;
import uiStore.HomeUi;
import utility.Logs;

public class HomePage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public HomePage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.creteLog();
	}
	
	public void clickOnSports() {
		helper.clickOn(HomeUi.sportstab);
		log.info("Successfully clicked on Sports");
	}
	
	public void clickOnSearch() {
		helper.clickOn(HomeUi.search);
		log.info("Successfully clicked on search icon");
	}
	
	public void clickOnTerms() {
		helper.explicitWait(HomeUi.terms, 50);
		helper.clickOn(HomeUi.terms);
	}

}
