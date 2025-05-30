package AutomationDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductWebElement {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		//findElement method
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//findElements method
		List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div")); //in xpath parent tag is div<inventory list> list tag for all elements is div with same class name
		System.out.println(webElements);                                                                    
		System.out.println(webElements.size());
		driver.quit();
		}
}
