
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo {
	public static void main(String[] args) throws IOException  {
		//step 1: create an object of  FileWriter class
	FileWriter fr=new FileWriter("C:\\eclipse_workspace\\ReadAndWrite\\src\\TestData.properties",true);
		
		
		// step 2: create an object of properties class
		Properties p=new Properties();
		
		//step 4: use set properties/store method to set property
		p.setProperty("URL", "www.udemy.com");
	    p.store(fr, "sample comment");	
	}

}
