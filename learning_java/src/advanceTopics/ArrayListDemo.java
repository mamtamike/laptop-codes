package advanceTopics;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		//add items to list
		al.add(10);
	//	al.add("Abc");
		//al.add(true);
		//al.add(false);
		//al.add("mn");
		
		//System.out.println(al);
		//System.out.println(al.size());
		//remove items from list
	//	al.remove(0);
		//System.out.println(al);
		//duplicate objects in list
		//al.add(10);
		//al.add("Abc");
		//al.add(true);
		//System.out.println(al);
		//fetch element
	//	System.out.println(al.get(1));
		//loop in list
		for(int i=0; i<al.size(); i++) {
		System.out.println(al.get(i));
		
		}
		//for each loop
	//	for(Object obj:al) {
		//	System.out.print(obj+" ");
		//}
		
	
	
	}

}
