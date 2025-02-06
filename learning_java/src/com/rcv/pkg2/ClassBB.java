package com.rcv.pkg2;

import advanceTopics.*; //.* to import methods of all classes from this package

public class ClassBB {
	public static void main(String[] args) {
		
		AccessModifier Ac = new AccessModifier();//method from class accessModifier of pkg1
		Ac.publicMethod();
		ClassAA ob = new ClassAA();//method from classAA of pkg1
		ob.methodAA();
		
	}

}
