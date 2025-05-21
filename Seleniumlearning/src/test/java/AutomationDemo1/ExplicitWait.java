package AutomationDemo1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(element).perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")));
		element1.click(); // wait for element to be in DOM and should be visible
		//other expected conditions
		WebElement element2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")));
         element2.click(); //wait for element to be enable to click
     	WebElement element3=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")));
        element3.click(); //wait for element to be in DOM need not to be visible
        boolean element4=wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")));
        //wait for element to select ex- checkbox, dropdown
    	
        boolean textPresent = wait.until(ExpectedConditions.textToBePresentInElementLocated(
        	    By.id("message"), "Success")); //wait until specific text to be appear on a webelement
    	
        			
		}
	}


