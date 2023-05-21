package loop;

public class While_Loop_Evennoseries {
	
	// Print even number from 100 to 123 
	
	public void t1 () {
		int count = 0 ;
		int i =100 ;
		
		while(i<=123) 
		{
			count++;
		    System.out.println (i);
			i++;
			
		}
		System.out.println ("-----------------"+"\n"+"Total count : "+ count);
		}
	
	public static void main (String [] args) {
		While_Loop_Evennoseries k = new While_Loop_Evennoseries ();
		k.t1 ();
	}

}
