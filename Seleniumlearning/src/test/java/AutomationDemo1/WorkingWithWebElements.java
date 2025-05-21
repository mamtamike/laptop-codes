package AutomationDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElements {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click(); //accept cookies
		
		driver.findElement(By.name("input_3.3")).sendKeys("tester");
		driver.findElement(By.name("input_3.3")).clear();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getCssValue("color"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-20406\"]/a/span[1]")).getText());
		
	}
}
