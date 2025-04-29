package AutomationDemo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.className("iframeResult"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("harry potter");
		driver.switchTo().alert().accept();
//		Alert alertpage = driver.switchTo().alert(); // alert as datatype and store alert method
//		alertpage.sendKeys("harrypotter");
//		alertpage.accept();
//		
		
	
//		driver.get("https://www.w3schools.com/Jsref/tryit.asp?filename=tryjsref_alert");
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
//		Thread.sleep(2000);
//		//String alerttext = driver.switchTo().alert().getText();
		//System.out.println(alerttext);
//
//		driver.switchTo().alert().accept(); 
//	    driver.switchTo().alert().dismiss();

//		Alert alert2 = driver.switchTo().alert(); // alert as datatype and store alert method
//		System.out.println(alert2.getText());
//		alert2.accept();


	}

}
