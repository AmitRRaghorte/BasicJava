package task;

public class Even_No {
	
	public void m5 ()
	{
		int a = 10 ;
		
		if (a%2 == 0) {
			System.out.println ("10 is even number");
		}
		else {
			System.out.println ("10 is odd number");
		}
		
	}
	public static void main (String [] args )
	{
		Even_No  p = new Even_No ();
		p.m5 ();
		
	}

}
