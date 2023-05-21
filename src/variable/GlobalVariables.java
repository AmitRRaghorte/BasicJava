package variable;

public class GlobalVariables {

	

		int a = 100 ;
		int b = 200 ;

		public void t1 (){

		int c = b-a ;
		int d = a+b ;
		int e = a-b ;
		int k = a/b ;

		System.out.println (c+"\n"+d+"\n"+e+"\n"+k);

		}

		public static void main (String [] args) {

		GlobalVariables g = new GlobalVariables ();
		g.t1 ();

		}

		}

