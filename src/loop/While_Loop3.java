package loop;

public class While_Loop3 {
	
	public void m5 ()
	
	{
		int count = 0;
		int i = 89;
		while (i>=59)
		{
			count--;
			System.out.println (i);
			i--;
		}
		System.out.println ("----------------"+"\n"+"Total count : "+count);
	}
	
	public static void main (String [] args)
	
	{
		While_Loop3 w = new While_Loop3 ();
		w.m5();
	}

}
