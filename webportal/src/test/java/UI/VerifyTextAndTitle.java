package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.commondatasetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTextAndTitle extends commondatasetup {
	@Test
	public void textTitle() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		SoftAssert softassert=new SoftAssert();
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext = "Searchaa";
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).getDomAttribute("value");
		String actualtitle = driver.getTitle();
		softassert.assertEquals(actualtitle, expectedtitle);
		softassert.assertEquals(actualtext, expectedtext, "verification failed");
		driver.close();
		softassert.assertAll();
        
	}
}
