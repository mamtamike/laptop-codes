package AutomationDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.asx.com.au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pnProductNavContents\"]/h5[2]")).click();
		// step 1-get number of rows
		// step 2-get number of column
		// step 3-iterate rows and column, get text and print it
		List<WebElement> rowElement = driver
				.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr"));
		System.out.println(rowElement.size());
		List<WebElement> columnElement = driver
				.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[1]/th"));
		System.out.println(columnElement.size());
		
		
		
		for(int i=2; i<=rowElement.size(); i++) {
			for(int j=1; j<=columnElement.size(); j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[ " + i + " ]/td[ " + j + "]")).getText()+",  ");
				
			}
			System.out.println();
		}
	}
}


