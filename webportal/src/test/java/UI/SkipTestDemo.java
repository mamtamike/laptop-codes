package UI;

import org.testng.SkipException;

import org.testng.annotations.Test;

import common.commondatasetup;

public class SkipTestDemo extends commondatasetup {
	
	boolean dataset=true;
	@Test(enabled=false)
	public void skip1() {
		System.out.println("skip test as it is not completed");
	}
	@Test
	public void skip2() {
		System.out.println("skip test forcefully");
		throw new SkipException("skiping this test");
	}
	@Test
	public void skip3() {
		if (dataset==true) {
		System.out.println("skip test on condition");
		throw new SkipException("do not execute further step");
	}
	else {
		System.out.println("execute test");
	}

}
}
