package UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.commondatasetup;
public class LoginTest extends commondatasetup {
	@BeforeTest
	public void loginToApplication() {
		System.out.println("login to application");
	}
	@AfterTest
	public void logoutToApplication() {
		System.out.println("logout to application");
	}
	@BeforeMethod
	public void connectToDB() {
		System.out.println("connected DB");
	}
	@AfterMethod
	public void disconnectToDB() {
		System.out.println("disconnect DB");
	}
	
	@Test(priority=1,description="this is login test")
	public void login() {
		System.out.println("login successful");
	}
	@Test(priority=2,description="this is logout test")
	public void logout() {
		System.out.println("logout successful");
	}

}
