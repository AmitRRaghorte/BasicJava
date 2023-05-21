package controlFlow_Statement;

public class If_else_if {

	public void m5 ()
	{
		int mark = 65 ;
		
		if (mark <40 ) {
			System.out.println ("You failed");
		}
		else if (mark >=50 && mark <60) 
		{
			System.out.println ("D-grade");
		}
		else if (mark < 70 && mark >60) 
		{
			System.out.println ("C- grade");
		}
		else if (mark >= 80 && mark <=75) 
		{
			System.out.println ("B-grade");
		}
		else 
		{
			System.out.println ("Failed");
		}
	}
	
	public static void main (String [] args)
	{
		If_else_if v = new If_else_if ();
		v.m5 ();
	}
}
