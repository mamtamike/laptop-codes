package AutomationDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		driver.findElement(By.xpath("//input[@id='sunday']")).click();

		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@class='form-check-input' and  @type='checkbox']"));
		System.out.println(checkboxs.size());
		for (int i = 0; i < checkboxs.size(); i++) {
			checkboxs.get(i).click();
			System.out.println(checkboxs.get(i).isSelected()); 
//		checkboxs.get(0).click();
//		checkboxs.get(0).click();	

		}
	}
}
