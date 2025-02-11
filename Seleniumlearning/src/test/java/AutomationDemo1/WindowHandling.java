package AutomationDemo1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterators=windowhandles.iterator();
		String parentWindow=iterators.next();
		String childWindow=iterators.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("harry");
		driver.findElement(By.name("UserLastName")).sendKeys("potter");
		driver.switchTo().window(parentWindow);
		driver.quit();	
	}

}
