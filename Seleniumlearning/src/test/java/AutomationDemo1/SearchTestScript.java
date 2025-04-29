package AutomationDemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTestScript {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.ebay.com");
	driver.manage().window().maximize();
	driver.findElement(By.tagName("input")).sendKeys("mobile");
	driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
	}
}
