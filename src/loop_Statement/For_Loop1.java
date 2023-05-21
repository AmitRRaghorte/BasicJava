package loop_Statement;

public class For_Loop1{
	
	// Print number from 1 to 10 and count it
	
	
	public void t1 () {
		int count = 0;
		int i = 1 ;   // Start pt
		             // 10 end pt
		             // i ++ increment (1 to 10 )
		
		for (i=1 ;i<=10;i++)
		{
			
			count++ ;
			System.out.println (i);
			
			
		}
		System.out.println ("--------------"+"\n"+count);
		
	}
	public static void main (String [] args ) {
		
		For_Loop1 f = new For_Loop1 ();
		f.t1();
		
	}

}
