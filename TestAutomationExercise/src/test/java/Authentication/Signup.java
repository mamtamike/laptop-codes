package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class Signup extends BaseTest {
	@Test
	public void signupTest() {
		

		System.out.println("Title of window is: "+driver.getTitle());
		
		// signup link click on menu bar
		WebElement buttonEnable=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		System.out.println("signup/login button enable: "+buttonEnable.isEnabled());
        WebElement button = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		System.out.println("Text visible on menu bar is: "+button.getText());
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		System.out.println("Tittle of window is: "+driver.getTitle());
		// name
		WebElement inputField1=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		System.out.println("inputField1 is: "+inputField1.getDomAttribute("placeholder"));
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("harry");
		// email
		 WebElement inputField2= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
	     System.out.println("inputField2 is: "+inputField2.getDomAttribute("placeholder"));
         driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("test.admin@yopmail.com");
      
        
		// login button
		WebElement signupButtonDisplay=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		System.out.println("signup button is displayed: "+signupButtonDisplay.isDisplayed());
		WebElement signupButton=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		System.out.println("Text visible on button: "+signupButton.getText());
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();

	}

}
