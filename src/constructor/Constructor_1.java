package constructor;

public class Constructor_1 {
     int a ;                       // Declaration
     int b ;
     
  public Constructor_1 ()
  {
	  a = 100 ;                  //Initialisation
	  b = 25 ;
	  
  }
  
  public void m5 ()
  {
	  int c = a/b ;
	  System.out.println (c);
	  
  }
  
  public static void main (String [] args)
  {
	  Constructor_1 k = new Constructor_1 ();
	             k.m5 ();
  }
}
