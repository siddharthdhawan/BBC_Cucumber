package pageObject;

import org.apache.logging.log4j.Logger;

import reusuable.WebDriverHelper;
import uiStore.TermsUi;
import utility.Logs;

public class TermsPage {
	

	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public TermsPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.creteLog();
	}
	
	public String getTitle() {
		helper.explicitWait(TermsUi.access, 50);
		String text=helper.getText(TermsUi.access);
		log.info("Successfully got the text");
		return text;
	}

}
