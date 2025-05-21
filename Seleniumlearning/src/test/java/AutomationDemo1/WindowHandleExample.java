package AutomationDemo1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

	public class WindowHandleExample {
	    public static void main(String[] args) throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to a test site with multiple windows
	            driver.get("https://the-internet.herokuapp.com/windows");

	            // Store the main window handle
	            String mainWindowHandle = driver.getWindowHandle();
	            System.out.println("Main Window Handle: " + mainWindowHandle);

	            // Click the link that opens a new window
	            driver.findElement(By.linkText("Click Here")).click();
	            Thread.sleep(2000);
	            // Get all window handles
	            Set<String> allWindowHandles = driver.getWindowHandles();

	            // Iterate through handles and switch to the new one
	            for (String handle : allWindowHandles) {
	               
	                    System.out.println("window: " + handle);
	                    System.out.println("Window Title: " + driver.getTitle());
	                }
	            // Switch back to main window
	            driver.switchTo().window(mainWindowHandle);
	            System.out.println("Switched back to main window. Title: " + driver.getTitle());

	        } finally {
	            // Close the browser after a short delay
	            Thread.sleep(3000);
	            driver.quit();
	        }
	    }
	}

	


