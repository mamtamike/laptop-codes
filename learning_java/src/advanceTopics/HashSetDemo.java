package advanceTopics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		System.out.println(hs);
		hs.remove(10);
		System.out.println(hs);
	
	for(Integer intdemo:hs) {
		System.out.println(intdemo);
	}
	//loop through iterator
	Iterator<Integer> it=hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
