package uiStore;

import org.openqa.selenium.By;

public class HomeUi {
	
	public static By sportstab=By.xpath("//div[@id='orb-header']/descendant::nav[@class='orbit-header-links international']/descendant::li[@class='orb-nav-sport']");
	public static By search=By.xpath("//a[@id='orbit-search-button']");
	public static By terms=By.xpath("//div[@id='orb-contentinfo']/descendant::li[@class='orb-footer-terms']/child::a");
}
