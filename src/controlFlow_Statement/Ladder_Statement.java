package controlFlow_Statement;

public class Ladder_Statement {

	

		public void m5 ()

		{
		  int mark = 65 ;

		   if (mark < 60)
		 {
		   System.out.println ("A-grade");
		 }
		 else if (mark>=65 && mark>60) 
		{
		  System.out.println ("A+");
		}
		else if (mark == 65)
		{
		  System.out.println ("Mindblowing");
		 
		}
		else 
		{
		System.out.println ("Enter invalid data");
		}

		}

		public static void main (String [] args)
		{
			Ladder_Statement f = new Ladder_Statement ();
		     f.m5 ();

		}

		}

