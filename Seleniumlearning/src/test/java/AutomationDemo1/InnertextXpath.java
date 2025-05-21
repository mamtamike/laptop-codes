package AutomationDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnertextXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=cms/feature");
		boolean displayStatus=driver.findElement(By.xpath("//h1[text()='OpenCart Features']")).isDisplayed();
		System.out.println(displayStatus);
		String value=driver.findElement(By.xpath("//h1[text()='OpenCart Features']")).getText();
		System.out.println(value);
	}

}
