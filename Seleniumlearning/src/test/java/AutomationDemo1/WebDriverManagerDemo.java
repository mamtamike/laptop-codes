package AutomationDemo1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); //here WebDriverManager is a jar which control and setup the required version of browser
		ChromeDriver driver=new ChromeDriver(); //here we implemented ChromeDriver class from WebDriverInterface and driver is the instance of that WebDriver
		driver.get("http://www.udemy.in");
		driver.manage().window().maximize();
		driver.close();
		
	}
}

