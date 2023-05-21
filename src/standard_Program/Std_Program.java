package standard_Program;

public class Std_Program {
	
	int a ;             // Declaration
	int b ;            //  Declaration
	
	public void m5 ()
	{
		a = 100;         //Initialisation
		b = 200 ;        // Initialisation
	    System.out.println (a+b);
	    System.out.println (b/a);
		System.out.println (b-a);
	}
	
  public void m6 ()
  {
	  a = 1000;
	  b = 500 ;
	  System.out.println (a/b);
	  
  }
  
  public static void main (String [] args)   // Usage
  
 {
	Std_Program k  = new Std_Program ();
	  k.m5();
	  k.m6 ();
	  
 }
}
