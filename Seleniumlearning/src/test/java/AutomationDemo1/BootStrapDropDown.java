package AutomationDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //opens dropdown options
		//select single option
	   // driver.findElement(By.xpath("//input[@value='jQuery']")).click(); //locate by checkbox button and click for single select option

		//capture all the options and size
		
	List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label")); //locate by label for all options in ul list		
	System.out.println(options.size());
	//printing options from dropdown using index for loop
	for(int i=0; i<options.size(); i++) {
		System.out.println(options.get(i).getText());
	}
	//select options by index from dropdown
	options.get(0).click();
	options.get(1).click();
	options.get(2).click();
	
		//printing options from dropdown using enhance for loop
//		for(WebElement op:options) {
//			System.out.println(op.getText());
//		}
		//select multiple options by enhance loop without index and using only texts 
//		for(WebElement op:options) {
//			String selectoptions=op.getText();
//			if(selectoptions.equals("Java")|| selectoptions.equals("Python")||selectoptions.equals("MySQL")){ //if gettext equals to label then click op.click();
//			}
		}
	}

