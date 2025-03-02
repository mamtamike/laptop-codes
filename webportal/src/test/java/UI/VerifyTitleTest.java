package UI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.commondatasetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest extends commondatasetup{
	
	@Test
	public void titleTest() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
		
	}

}
