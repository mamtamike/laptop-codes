package advanceTopics;

public class AccessModifier {
	
		
		public int publicVariable=1;
	    int defaultVariable = 2;
		private int privateVariable= 3;
		protected int protectedVariable =4;

		public static void main(String[] args) {
			AccessModifier Ac = new AccessModifier();
		//	Ac.protectedVariable();
			Ac.protectedMethod();
			
		}
		
		public void publicMethod()
		{
			System.out.println("public Method");
		}
		void defaultMethod()
		{
			System.out.println("default Method");
		}
		private void privateMethod()
		{
			System.out.println("private Method");
		}
		protected void protectedMethod()
		{
			System.out.println("protected Method");
		}
}
