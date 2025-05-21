package AutomationDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInWebDriverInterface {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); //here WebDriverManager is a jar which control and setup the required version of browser
		ChromeDriver driver= new ChromeDriver(); //here we implemented ChromeDriver class from WebDriverInterface and driver is the instance of that WebDriver
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title=driver.getTitle();
		System.out.println(title);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
	    driver.navigate().to("https://www.automationexercise.com/");
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();

		}
}
