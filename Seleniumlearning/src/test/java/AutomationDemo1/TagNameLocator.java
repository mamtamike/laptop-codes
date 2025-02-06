package AutomationDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameLocator {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
//		driver.findElement(By.linkText("Form Authentication")).click();
//		driver.findElement(By.name("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		WebElement table=driver.findElement(By.tagName("table"));
		List<WebElement> tableRows= table.findElements(By.tagName("tr"));
		System.out.println(tableRows.size());
		System.out.println(tableRows.get(1).getText());
		
	}

}
