package logical;

public class EvenNumber {
	
	public void t1 () {
		int a = 5 ;
		if (a%2==0) {
			System.out.println ("5 is even number");
		}
		else
		{
			
			System.out.println ("5 is not even number");
		}
	}
		
		public static void main (String [] args) {
			EvenNumber e = new EvenNumber ();
			e.t1 ();
			
		}
	}


