package CustomException;

public class ThrowVsThrows {
	public static double area(int r) throws MyException{
		if(r<0) {
			throw new MyException("radius can not be negative");
		}
		double result=Math.PI*r*r;
		return result;
	}
	public static void main(String[] args) {
		try {
			double ar=area(-1);
			System.out.println(ar);
		}
		catch (MyException e){
			System.out.println(e.getMessage());
			
		}
	}

}
