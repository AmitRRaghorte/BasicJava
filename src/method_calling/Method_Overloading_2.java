package method_calling;

public class Method_Overloading_2 {
 // Method_Overloading by changing datatype of parameter 
	
	public static void m5 (int a)
	{
		System.out.println ("Amit");
	}
	public static void m5 (String a)
	{
		System.out.println ("Raghorte");
	}
	public static void main (String [] args)
	{
		m5 (1);
		m5 ("hello");
		
	}
}
