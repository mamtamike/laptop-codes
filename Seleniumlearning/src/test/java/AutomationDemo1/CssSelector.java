package AutomationDemo1;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		
		//tag#id
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("tshirt");
	   // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("tshirt");
	    
	    //tag.classname
	    //  driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("tshirt");
	   //  driver.findElement(By.cssSelector(".search-box-text")).sendKeys("tshirt");
		
	     //tag[attribute='value']
	    // driver.findElement(By.cssSelector("input[name='q']")).sendKeys("tshirt");
	    // driver.findElement(By.cssSelector("[name='q']")).sendKeys("tshirt");
		
	}
}
