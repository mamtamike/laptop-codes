package UI;

import org.testng.annotations.Test;

public class DataProvideFetchData {
	@Test(dataProvider="create",dataProviderClass=DataProviderSetup.class)
	public void test1(String username, String password, String test) {
		System.out.println(username+",  "+password+", "+test);
	}
	
	@Test(dataProvider="dataset",dataProviderClass=DataProviderSetup.class)
	public void test(String username, String password) {
		System.out.println(username+",  "+password);
	}


}
