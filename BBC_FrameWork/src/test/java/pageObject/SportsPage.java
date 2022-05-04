package pageObject;

import org.apache.logging.log4j.Logger;


import reusuable.WebDriverHelper;
import uiStore.SportsUi;
import utility.Logs;

public class SportsPage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public SportsPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.creteLog();
	}
	
	public String getHeading() {
		String text=helper.getText(SportsUi.sportsTitle);
		log.info("Successfully get the heading of page");
		return text;
	}
}
