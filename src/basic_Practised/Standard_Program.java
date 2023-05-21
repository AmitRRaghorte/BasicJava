package basic_Practised;

public class Standard_Program {
	

		int a ;    // Declaration
		int b ;

		public void t1 () { 

		a = 100 ; // intialisation
		b = 5 ;

	int	c= a-b ;
	int	d = a/b ;
	int	r = a%b ;
	int	f = b%a ;

		System.out.println (c+"\n"+d+"\n"+r+"\n"+f);
		}

		public static void main (String [] args){

		Standard_Program  s = new Standard_Program ();
		s.t1();
		}
		}


