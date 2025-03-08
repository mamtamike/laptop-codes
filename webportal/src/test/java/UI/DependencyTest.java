package UI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	@Test
	public void userRegistration() {
		Assert.assertTrue(false);
		System.out.println("test1 execution");

	}

	@Test(dependsOnMethods="userRegistration",alwaysRun=true)
	public void userSearch() {
		System.out.println("test2 execution");

	}

	@Test
	public void Test3() {
		System.out.println("test3 execution");

}
}
