package advanceTopics;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> mp=new HashMap<String, String>();
		mp.put("qa", "carakart.com");
		mp.put("uat", "http//carakart.com");
		System.out.println(mp);
		mp.remove("qa");
		System.out.println(mp);
		Set s=mp.keySet();
		for(String key:mp.keySet()) {
			System.out.println("key is: "+key+", " +"value is: "+mp.get(key));
		}
	}

}
