package AutomationDemo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertExample {
    public static void main(String[] args) {
      

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // ===== 1. Simple Alert =====
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
            wait.until(ExpectedConditions.alertIsPresent());
            Alert simpleAlert = driver.switchTo().alert();
            System.out.println("Simple Alert text: " + simpleAlert.getText());
            simpleAlert.accept();

            // ===== 2. Confirm Alert =====
            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
            wait.until(ExpectedConditions.alertIsPresent());
            Alert confirmAlert = driver.switchTo().alert();
            System.out.println("Confirm Alert text: " + confirmAlert.getText());
            confirmAlert.dismiss(); // You could use accept() instead

            // ===== 3. Prompt Alert =====
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            wait.until(ExpectedConditions.alertIsPresent());
            Alert promptAlert = driver.switchTo().alert();
            System.out.println("Prompt Alert text: " + promptAlert.getText());
            promptAlert.sendKeys("Hello from Selenium!");
            promptAlert.accept();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}



