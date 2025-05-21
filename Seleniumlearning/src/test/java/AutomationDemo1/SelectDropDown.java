package AutomationDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/"); // single select dropdown
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click(); // accept
																													// cookies
		WebElement dropBox = driver.findElement(By.name("input_8"));
		Select selectoption = new Select(dropBox);

		selectoption.selectByIndex(1); //click the option
		Thread.sleep(2000);
		//selectoption.selectByValue("level4");
		//Thread.sleep(2000);
		//selectoption.selectByVisibleText("2,501 - 5,000 employees");
		WebElement firstOption = selectoption.getFirstSelectedOption(); // gives default option text we can use it to
		// verify 
        System.out.println(firstOption.getText());

		List<WebElement> options = selectoption.getOptions(); //here we stored all webelement in array list which we call by index
		System.out.println(options.size());
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText()); //print all options
		}
		for (WebElement op: options) { //enhance loop method in which no need to depend on indexes
			System.out.println(op.getText());
		}
	
		driver.quit();
}
}
