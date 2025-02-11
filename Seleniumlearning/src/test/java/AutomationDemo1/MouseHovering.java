package AutomationDemo1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHovering {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(element).perform();  //scroll mouse or hover mouse on element 
		
	}

}
