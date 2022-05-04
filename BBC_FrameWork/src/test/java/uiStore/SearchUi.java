package uiStore;

import org.openqa.selenium.By;

public class SearchUi {
	
	public static By searchbox=By.xpath("//input[@id='search-input']");
	public static By searchbtn=By.xpath("//button[@type='submit']");
	public static By result1=By.xpath("//main/descendant::li[1]/descendant::a");
	public static By resultHeading=By.xpath("//div[@class='br-masthead__title']");

}
