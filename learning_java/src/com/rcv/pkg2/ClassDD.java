package com.rcv.pkg2;

//import com.rcv.pkg1.AccessModifier;
//
//public class ClassDD extends AccessModifier {
//	public static void main(String[] args) {
//		
//		AccessModifier Ac = new AccessModifier();
//		ClassDD da = new ClassDD();
//		da.protectedMethod();
//		
//
//		
//	}
//
//}


public class ClassDD {
    public static void main(String[] args) {
    	
    	ClassB ob=new ClassB();
    	ob.nameA();
        System.out.println("Running ClassA");
    }
}

 class ClassB {
    public static void main(String[] args) {
    	
        
    }
      public void nameA()
      {
    	  System.out.println("hello");
    			
      }
 }  
        
        
    


