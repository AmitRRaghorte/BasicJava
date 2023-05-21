package operators;

public class Shift_Operator {
	public static void main (String [] args)
	{
		int a = 10 ; // Left Shift
		System.out.println (a<<2); // 10 * (2 resttothepower 2) = 40
		System.out.println (a<<3); // 10 * (2resttothepower 3) = 80
		System.out.println (a<<4); // 10 * (2resttothepower 4) = 160
		
		
		int b = 10 ; // Right Shift
		System.out.println (b>>2); // 10 / (2 resttothepower  2) = 2  (10/4)
		System.out.println (b>>3); // 10 /(2 resttothepower 4)  = 0  (10/16)
	}

}
