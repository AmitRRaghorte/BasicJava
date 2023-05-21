package loop;

public class While_Loop {
	
	// Print 1 to 10 ;
	// count 
	
	public void t1 () {
		int count = 0;
		
		int i = 1 ;
		while (i<=10)
		{
		 count++;
		 System.out.println (i);
		 i++;
			
		}
		 System.out.println ("Total count : " + count);
	
		
	}
	
	public static void main (String [] args) {
		While_Loop k = new While_Loop ();
		k.t1 ();
	}
}
