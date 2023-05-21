package variable;

public class Local_Variable {
	
	public static void m5 ()
	{
		int i = 50;
		System.out.println (i);
	}
	
	public void m6 ()
	{
		int i = 69;
		System.out.println (i);
	}

	public static void main  (String [] args) 
	{
		m5 ();
		Local_Variable l = new Local_Variable ();
		l.m6 ();
		
	}
}
