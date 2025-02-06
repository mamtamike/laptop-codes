package AutomationDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDriver\\msedgedriver.exe");
		System.setProperty("webdriver.firefox.driver", "C:\\BrowserDriver\\geckodriver.exe");
		
		EdgeDriver driver1=new EdgeDriver();
		FirefoxDriver driver2=new FirefoxDriver();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.udemy.in");
		driver1.get("http://www.google.com");
		driver2.get("http://www.google.com");	
	}
}
