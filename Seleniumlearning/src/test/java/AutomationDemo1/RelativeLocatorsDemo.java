package AutomationDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.saucedemo.com");
	WebElement passwordField=driver.findElement(By.id("password"));
	driver.findElement(with(By.tagName("input")).above(passwordField)).sendKeys("Tester");
	driver.findElement(with(By.tagName("input")).below(passwordField)).click();
	}
}
