package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties p=new Properties();
	public static FileReader fr;

    @BeforeSuite
	public void setup() throws IOException {
    	if(driver==null) {
    	FileReader fr=new FileReader("C:\\eclipse_workspace\\TestAutomationExercise\\src\\test\\resources\\configfiles\\testdata.properties");
    	p.load(fr);
    	}
    	if(p.getProperty("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("testurl"));
	    }
    	else if(p.getProperty("browser").equalsIgnoreCase("firefox")){
    		WebDriverManager.firefoxdriver().setup();
    		driver = new FirefoxDriver();
    		driver.manage().window().maximize();
    		driver.get(p.getProperty("testurl"));
    	}
    	else if(p.getProperty("browser").equalsIgnoreCase("edge")){
    		WebDriverManager.edgedriver().setup();
    		driver = new EdgeDriver();
    		driver.manage().window().maximize();
    		driver.get(p.getProperty("testurl"));
    		
    	}	
    }

	@AfterSuite
	public void CloseBrowser() {
		driver.close();
	}

}



