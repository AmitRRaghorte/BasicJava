package method_calling;

public class Method_Overloading_1 {

	// Method overloading by changing the no.of parameter
	
	public void m5 (int a) 
	{
		System.out.println ("Argument"+ a);
	}
	public void m5 (int a, int b )
	{
		System.out.println ("Argument"+a+"and"+b);
	}
	
	public static void main (String [] args)
	{
			Method_Overloading_1 m = new Method_Overloading_1 ();
		    m.m5(1);
		    m.m5(1,4);
		
	}
	
}
