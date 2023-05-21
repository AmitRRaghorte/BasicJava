package operators;

public class Unary_Operators {     // post fix ++

	public static void main (String [] args )
	{
		int a = 10;
		System.out.println (a);        //10
		System.out.println (a++);     // (10 +1)
		System.out.println (a);      // 11
		System.out.println (a++);   //(11 +1)
		System.out.println (a);    //  12
		
		int b = 10 ;  // POST FIX
		System.out.println (b--);    // 10 -1
		System.out.println (b);     // 9
		System.out.println (b--);  // 9 -1
		System.out.println (b);    // 8
		
		int c = 10 ;    //PRE-FIX
		System.out.println (++c); // 10 +1 = 11
		System.out.println (c);   // 11
		System.out.println (++c); // 11 +1 =12
		System.out.println (c);   // 12
		
		
		int d = 10 ;    // Pre-FIX
		System.out.println (--d);   // 10 -1 = 9
		System.out.println (d);     // 9
		System.out.println (--d);   // 9-1 =8
		System.out.println (--d);   // 8 -1 =7
		
		int e = 10 ;
		System.out.println (+e);  // 10
		System.out.println (-e);  // -10
		System.out.println (+e);  // 10
		System.out.println (-e);  //-10
		
		boolean f = 5 > 100 ;
		System.out.println (f); // False
		System.out.println (!f); // True (Inverting boolean value)
		
		int g = 10 ;  // [~ means -(n+1)]
		System.out.println (~g);     // -11
		System.out.println (g);    //  10
		System.out.println (~g);   // -11
		System.out.println (~g);  //  -11
	}
}
