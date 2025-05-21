package AutomationDemo1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopCommerce.com/");
		//capture all cookies on browsing above url
		Set<Cookie> cookies= driver.manage().getCookies(); // Cookie is a predefined class
		System.out.println("size of cookies: "+cookies.size());
		
	    //print cookies
		for(Cookie cookie: cookies) {
			System.out.println("cookie name: "+cookie.getName()+", "+"cookie value: "+cookie.getValue());
		}
		//add a cookie
		Cookie cookieobj=new Cookie("myCookie1234","12345");
		driver.manage().addCookie(cookieobj);
		//again capture cookies after adding one more
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies: "+cookies.size());
		//again print cookies after adding one more
		for(Cookie cookie: cookies) {
			System.out.println("cookie name: "+cookie.getName()+", "+"cookie value: "+cookie.getValue());
		}
		//delete a cookie by either object or cookie name
		driver.manage().deleteCookie(cookieobj);
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies: "+cookies.size());
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies: "+cookies.size());
		
		driver.quit();
		
	}

}
