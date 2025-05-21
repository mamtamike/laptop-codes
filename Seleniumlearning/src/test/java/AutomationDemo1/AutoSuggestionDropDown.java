package AutomationDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.makemytrip.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='From']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mumbai, India"); 
//		
//				
//	   //go through drop down list
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div/div/div[1]/div/p"));
//	    System.out.println(list.size());
//		list.get(2).click();
//		driver.close();		

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"stUuGf\"]/div/div[2]/div/div/div/div[2]/div/promo-button-text[1]/div/div")).click();
        driver.findElement(By.cssSelector("#input")).sendKeys("selenium", Keys.ENTER);
        driver.quit();
//		List<WebElement> list = driver.findElements(By.xpath(null));
//		System.out.println(list.size());
//		list.get(2).click();
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}

	}

}
