package UI;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class TestReport extends BaseTest{
	@Test
	public void Test1() {
		System.out.println("test1 execution");
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);
	}
	@Test
	public void Test2() {
		System.out.println("test2 execution");

	}
	@Test
	public void Test3() {
		System.out.println("test3 execution");
	}
	

}
