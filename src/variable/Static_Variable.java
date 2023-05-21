package variable;

public class Static_Variable {

	static int m = 200 ; // Static varibales can declared using static and non-static method
	static int n = 20;
	
	public void s1 ()
	{
		int d = 200 + 20 ; //local variables
		int c = 200-20;
		System.out.println (d);
		System.out.println (c);
	}
	
	public static void s2()
	{
		int z = m/n;
		int n = 20;
		System.out.println (z);
		System.out.println (n);
		
    }
	
	public static void main (String [] args)
	{
		Static_Variable s = new Static_Variable ();
		s.s1();
	     s2();
		
	}
}
