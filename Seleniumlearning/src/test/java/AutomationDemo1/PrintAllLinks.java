package AutomationDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click(); 

		List<WebElement> alltags=driver.findElements(By.tagName("a"));
		System.out.println(alltags.size());
		for(int i=0; i<alltags.size(); i++) {
			System.out.println("links are: "+alltags.get(i).getAttribute("href"));
			System.out.println("Texts are: "+alltags.get(i).getText());
		}
	}

}
