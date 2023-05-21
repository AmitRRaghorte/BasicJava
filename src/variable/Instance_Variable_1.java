package variable;

public class Instance_Variable_1 {

    int t = 100 ; // instance variable 
    int r = 20;
    
    public void p1 ()
    {
    	int k = t/r ;
    	System.out.println (k);
    }
    
    public void p2 ()
    {
    	
    	int k = t*r ;
    	System.out.println (k);
    	
    }
    
    public static void main (String [] args)
    {
    	Instance_Variable_1 a = new Instance_Variable_1 ();
    	a.p1 ();
    	a.p2 ();
    	
    }
}
