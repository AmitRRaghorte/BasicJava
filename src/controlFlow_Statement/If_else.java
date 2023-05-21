package controlFlow_Statement;

public class If_else {
	
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
	
	public static void main (String [] args) 
	{
		
		If_else p = new If_else ();
		p.m5();
	}
}
