package learning;

public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md= new MethodDemo();
	md.doLogin();
	doLogin1();
	md.doLogout();
	
	System.out.println(name());
	    // name();
		receiveName();
		
	}
  public void doLogin()
	{//start
		
	System.out.println("login successful");
		
		}//end
	
	public static void doLogin1()	{
     
		System.out.println("login successful");
	}

	public void doLogout()
	{
	 doLogin();
	 System.out.println("logout successful");
	 }
	public static char name()
	{
		return 'm';
	}
	
	public static void receiveName()

	{
		System.out.println(name());
	}
}
                                                                               