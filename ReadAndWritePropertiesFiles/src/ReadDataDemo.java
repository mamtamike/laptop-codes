
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {
//	public static void main(String[] args) throws IOException {
//		//step 1: create an object of  FileReader class
//	FileReader fr=new FileReader("C:\\eclipse_workspace\\ReadAndWrite\\src\\TestData.properties");
//		
//		
//		// step 2: create an object of properties class
//		Properties p=new Properties();
//		//step 3:load the file
//		
//		p.load(fr);  //p.load(reader) method
//		
//		//step 4: use get properties method
//		System.out.println(p.getProperty("Name"));
//	}
	
	public static void main(String[] args) {
		
	try {
FileReader fr=new FileReader("C:\\eclipse_workspace\\ReadAndWrite\\src\\TestData.properti");
		
		
		// step 2: create an object of properties class
		Properties p=new Properties();
		//step 3:load the file
		
		p.load(fr);  //p.load(reader) method
		
		//step 4: use get properties method
		System.out.println(p.getProperty("Name"));
	}
	catch (IOException e){ //exception handling
		System.out.println("error: "+e.getMessage());
	}
	}
}
