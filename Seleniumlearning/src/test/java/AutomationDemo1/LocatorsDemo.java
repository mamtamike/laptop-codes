package AutomationDemo1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.className("form_input")).sendKeys("tester");
	driver.findElement(By.tagName("input")).sendKeys("tester");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("tester");
	driver.get("https://www.selenium.dev/documentation/overview/");
	driver.findElement(By.linkText("WebDriver")).click();
	
}
}
