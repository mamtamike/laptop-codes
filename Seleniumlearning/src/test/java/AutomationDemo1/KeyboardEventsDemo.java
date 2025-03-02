package AutomationDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventsDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement sourceText = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/div[1]/pre"));
		Actions action = new Actions(driver);
		action.keyDown(sourceText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement targetText = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]"));
		action.keyDown(targetText, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
