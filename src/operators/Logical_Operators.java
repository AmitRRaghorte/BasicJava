package operators;

public class Logical_Operators {

	 public static void main (String [] args )
	 {
		 int a = 10;
		 int b = 5 ;
		 int c = 20 ;
		 System.out.println (a<b && a<c); // [False && True]=False     logical and 
		 System.out.println (a>b && a>c); // [True && False] =  False  logical and 
		 System.out.println (a>b && a<c); // [TRUE && True] = True     logical and 
		 System.out.println (a<b || a<c); // [false || True] = True    Logical OR 
		 System.out.println (a>b || a>c); // [True  ||False] = True    Logical OR
		 System.out.println (a>b || a<c); //  [True || True] = True    Logical OR
		 
		 System.out.println (a<b & a<c);    // [False & True]= False   BITWISE and 
		 System.out.println (a>b & a>c);   //  [True & False] =  False
		 System.out.println (a>b & a<c);   //  [TRUE & True] = True
		 System.out.println (a<b | a<c);   //  [false | True] = True    BITWISE OR
		 System.out.println (a>b | a>c);   //  [True  |False] = True
		 System.out.println (a>b | a<c);   //  [True | True] = True     
		 
		 
	 }
	
	
}
