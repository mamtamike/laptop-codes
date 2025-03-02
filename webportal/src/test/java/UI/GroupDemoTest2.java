package UI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.commondatasetup;

public class GroupDemoTest2 extends commondatasetup {
	@BeforeClass
	public void beforeClass() {
		System.out.println("run this before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("run this after class");
	}
	@BeforeGroups(value="regression")
	public void beforeGroup() {
		System.out.println("run this before regression");
			
		}
	@AfterGroups(value="regression")
	public void aftergroup() {
		System.out.println("run this after regression");
	}
	
	
	@Test(priority=1,groups="regression")
	public void login() {
		System.out.println("login successful");
	}
	@Test(priority=2,groups={"regression","smoke"})
	public void logout() {
		System.out.println("logout successful");
	}
	@Test(groups="bvt")
	public void atest() {
		System.out.println("atest passed");
	}
	@Test(groups="smoke")
	public void btest() {
		System.out.println("btest passed");
	}


}



