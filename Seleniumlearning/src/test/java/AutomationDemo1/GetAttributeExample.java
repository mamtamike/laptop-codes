package AutomationDemo1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GetAttributeExample {
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.wikipedia.org/");

	        try {
	            // Locate the element
	            WebElement element = driver.findElement(By.id("searchInput"));

	            // Get the 'placeholder' attribute value
	            @SuppressWarnings("deprecation")
				String name = element.getAttribute("name");
	            System.out.println("name: "+name );

	            // Get the 'disabled' attribute value
	            @SuppressWarnings("deprecation")
				String disabled = element.getAttribute("disabled");

	            // Display if the element is disabled
	            if (disabled != null) {
	                System.out.println("The element is disabled.");
	            } else {
	                System.out.println("The element is enabled.");
	            }

	        } finally {
	            driver.quit();
	        }
	    }
	}
