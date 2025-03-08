package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtilScreenshot extends BaseTest {

	public void getScreenshot() throws IOException {
		
	   Date currentDate=new Date();
	   System.out.println(currentDate);
	   String screenshotFileName=currentDate.toString().replace(" ", "-").replace(":", "-");
	   System.out.println(screenshotFileName);
	   
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" +screenshotFileName+ ".png"));
	}

	}


