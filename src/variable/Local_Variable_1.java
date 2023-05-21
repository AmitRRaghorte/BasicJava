package variable;

public class Local_Variable_1 {

	public static void t1 ()
	{
		int a = 20;              // local varibles
		int b = 30 ;             // local  varibles
		int c = a+b ;
		System.out.println (c);
	}
	
	public void t2 ()
	{
		int d = 100 ;
		int e = 67;
		int f = d-e ;
		System.out.println (f);
		
	}
	
	public static void main (String [] args)
	{
		Local_Variable_1 l =  new Local_Variable_1 ();
		l.t2 ();
		t1 ();
		
		
	}
}
