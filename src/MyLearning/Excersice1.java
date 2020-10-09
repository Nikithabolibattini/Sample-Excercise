package MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excersice1 {

		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedrivers\\chromedriver_win32 (84)\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.makemytrip.com/");
		//Driver.findElement(By.cssSelector("div.bgGradient div.minContainer main.landingContainer div.landingCard.appendBottom40.superOfferSection.page-section.sticky-scroll:nth-child(1) div.makeFlex.blackText.latoBold div.makeFlex.perfectCenter:nth-child(2) ul.makeFlex.capText.superOffersTab.appendLeft30 li.active.latoBlack:nth-child(4) span.pointer > span:nth-child(1)")).click();
		Driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		
		//span[@class='pointer']//span[contains(text(),'More')]
		}
}

