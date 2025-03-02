package AutomationDemo1;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		//driver.get("https://the-internet-herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		String username="admin"; //reading this from xls and csv
		String password="admin"; //reading this from xls and csv

		
		//to handle authentication pop just add authentication input like username & password before url
		driver.get("https://"+username+":"+password+"@the-internet-herokuapp.com/basic_auth"); //here admin is username and password both
	}

}
