package advanceTopics;

public class PolymorphismMethodOverloading {
	public static void main(String[] args) {
		PolymorphismMethodOverloading pm=new PolymorphismMethodOverloading();
		pm.login("harry", "krishna");
		pm.login(984567, "krishna", 1234);
		
	}
	public void login(String u, String s) {
		System.out.println("login successful using username,password");
	}
	public void login(int n, String s, int p) {
		System.out.println("login successful using number, password, pin");	
	}

}
