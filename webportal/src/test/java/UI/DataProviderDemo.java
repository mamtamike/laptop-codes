package UI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo  {
	@Test(dataProvider="create")
	public void test1(String username, String password, String test) {
		System.out.println(username+",  "+password+", "+test);
	}
	
	@Test(dataProvider="dataset")
	public void test(String username, String password) {
		System.out.println(username+",  "+password);
	}

	
	@DataProvider(name="create")
	public Object[][] dataset1() {
		return new Object[][] {
			{"username", "password", "test1"},
			{"username1","password1", "test2"},
			{"username2","password2", "test3"}
		};
		
	}
	@DataProvider
	public Object[][] dataset() {
		Object[][] dataset=new Object[3][2];
		//row 1
		dataset [0][0]="user1";
		dataset [0][1]="pass1";
		//row2
		dataset [1][0]="user2";
		dataset [1][1]="pass2";
		//row3
		dataset [2][0]="user3";
		dataset [2][1]="pass3";

        return dataset;

	}

}
