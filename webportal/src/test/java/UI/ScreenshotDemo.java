package UI;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ScreenshotDemo extends BaseTest {
	@Test
	public static void LaunchApp() {
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);
	}
}
