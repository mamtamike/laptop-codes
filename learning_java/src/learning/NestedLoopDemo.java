package learning;

public class NestedLoopDemo {
	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=3; i++) {
			int j=1;
			while(j<=4) {
				
				for(int x=1; x<=2; x++) {
					System.out.println(" value of i is " +i + " value of j is " +j +" value of x is " +x);
				count++;
				}
				j++;
			
			}
}
		System.out.println(count);
			
	}

}
 