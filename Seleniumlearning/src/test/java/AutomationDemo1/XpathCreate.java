package AutomationDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCreate {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//single attribute xpath build
	//	driver.get("https://demo.opencart.com/index.php?route=product/product&path=57&product_id=49");
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mobile");
		
	//multi attribute xpath build
		//driver.get("https://demo.opencart.com/index.php?route=product/product&path=57&product_id=49");
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("mobile");
		
		//'AND' 'OR' operators in xpath
    	//driver.get("https://demo.opencart.com/index.php?route=product/product&path=57&product_id=49");
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("mobile");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Sear']")).sendKeys("mobile");
		//driver.findElement(By.xpath("//input[@name='sea' or @placeholder='Sear']")).sendKeys("mobile");
		
		//xpath using innertext
	//	driver.get("https://demo.opencart.com/index.php?route=product/product&path=57&product_id=49");
		//	driver.findElement(By.xpath("//*[text()='Desktops']")).click();	
		
		//chained xpath
		driver.get("https://www.opencart.com");
		boolean status=driver.findElement(By.xpath("//button[@type='button']/a/img")).isDisplayed();
		System.out.println(status);
	}

}
