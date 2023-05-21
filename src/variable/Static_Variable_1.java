package variable;

public class Static_Variable_1 {
	
	static int o = 144;
	static int k = 12;
	
	public static void m5 ()
	{int h = o/k ;
	System.out.println (h);
	}
	public void m6 ()
	{
		int v = k/o;
		System.out.println (v);
		

	}
	
	public static void main (String [] args) 
	{
		Static_Variable_1  g = new Static_Variable_1  ();
		g.m6 ();
		m5 ();
		
		
		
	}
	
}
