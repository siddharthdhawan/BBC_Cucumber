package pageObject;

import java.io.IOException;

import org.apache.logging.log4j.Logger;


import reusuable.WebDriverHelper;
import uiStore.SearchUi;
import utility.Logs;
import utility.ReadExcel;

public class SearchPage {
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public SearchPage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.creteLog();
	}
	
	public void searchInput() throws IOException {
		helper.sendText(SearchUi.searchbox,ReadExcel.getCellDataString(1, 0));
		log.info("Succesfully sended text to search input box");
	}
	public void clickOnSearch() {
		helper.clickOn(SearchUi.searchbtn);
		log.info("Successsfully clicked on search button");
	}
	public void clickOnResult1() {
		helper.clickOn(SearchUi.result1);
		log.info("Successfully clicked on result 1");
	}
	public String getResultHeading() {
		String text=helper.getText(SearchUi.resultHeading);
		log.info("Successfully got the result 2");
		return text;
	}
}
