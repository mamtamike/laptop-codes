package AutomationDemo1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://www.ebay.com");
            driver.manage().window().maximize();

            // Locate the element to hover over
            WebElement element = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/a"));

            // Perform hover action
            Actions mouse = new Actions(driver);
            mouse.moveToElement(element).perform();

            // Fluent wait to handle dynamic elements
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(10))  // Max timeout
                    .pollingEvery(Duration.ofMillis(300)) // Check every 300ms
                    .ignoring(ElementNotInteractableException.class)
                    .ignoring(NoSuchElementException.class);  // Ignore element not found errors

            // Wait until submenu item is visible and click it
            WebElement subMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")));
            subMenu.click();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close browser
            driver.quit();
        }
    }
}
