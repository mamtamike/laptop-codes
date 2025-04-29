package advanceTopics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al= new ArrayList(); //list 1, which has all data type of objects
		ArrayList<Integer> al1= new ArrayList<Integer>(); //list=2, which has only integer type objects
		ArrayList<String> al2=new ArrayList<String>(); //list=3, specifies with only string type objects
		//add items to lists
		al1.add(10);  //here 10 is object not integer and it is auto wrapped into object in list al1
		al2.add("Abc");  //string element in list al2
		al.add(true);
		al.add(false);
		al.add("mn");
		
		System.out.println(al);   //print all list element
		System.out.println(al.size());  //print size of the list
		System.out.println(al1);
		System.out.println(al2);
		
		//remove items from list
	    al.remove(0);
		System.out.println(al);
		
		//duplicate objects in list
		al.add("mn");
		al.add(true);
		System.out.println(al);
		
		//fetch element
	System.out.println(al.get(1));
	
		//loop in list
//		for(int i=0; i<al.size(); i++) {
//		System.out.println(al.get(i));
//		}
	
		//for each loop
	//	for(Object obj:al) {
		//	System.out.print(obj+" ");
		//}
		
	//iterator method to fetch list element
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	}

}
