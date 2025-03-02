package AutomationDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement slide=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions action=new Actions (driver);
		action.dragAndDropBy(slide,162,22).perform();//move slider forward
		action.dragAndDropBy(slide, -56, 18).perform(); //move slider backward
		

}
}