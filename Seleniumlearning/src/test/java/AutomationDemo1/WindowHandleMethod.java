package AutomationDemo1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();


		driver.get("https://www.sugarcrm.com"); //first window
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click(); // accept
																													// cookies

		String windowID = driver.getWindowHandle();
		System.out.println("windowid is:" + windowID);

		driver.findElement(By.linkText("Login")).click();  //second window navigate
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"menu-item-205\"]/div/a")); //handle dropdowns
		System.out.println(options.size());
		System.out.println(options);
		options.get(0).click();

		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println("windowIDs are:" + windowIDs);
	}
}
