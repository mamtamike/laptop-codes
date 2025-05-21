package AutomationDemo1;


	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class JavaScriptExecutorExecutor {

	    public static void main(String[] args) throws InterruptedException {
	        // Setup WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.selenium.dev/");

	        // Create JavaScriptExecutor instance
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        //  Scroll down to "Selenium Level Sponsors" section
	        WebElement DonateToSelenium = driver.findElement(By.xpath("//*[text()='Donate to Selenium']"));
	        js.executeScript("arguments[0].scrollIntoView(true);", DonateToSelenium);
	        Thread.sleep(2000);

	        // Click the "Donate" button using JavaScript
	        WebElement openCollectiveBtn = driver.findElement(By.xpath("//*[text()='Open Collective']"));
	        js.executeScript("arguments[0].click();", openCollectiveBtn);

	        
        //scroll up 
//	    	js.executeScript("window.scrollBy(0,-500)");
//	    	//scroll down
//	    	js.executeScript("window.scrollBy(0,500)");
	        
	        driver.quit();
	    }
	}



