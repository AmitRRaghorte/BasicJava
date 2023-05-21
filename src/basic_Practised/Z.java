package basic_Practised;

public class Z {
	
	public void m5 ()
	{
		String UID = "amitraghorte7@gmail.com" ;
		String pwd = "amit0000";
		
		if (UID=="amitraghorte7@gmail.com") 
		{
		if (pwd == "amit0000") 
		{
		System.out.println ("Welcome to facebook");	
		}
	     else 
	     {
	     System.out.println ("You have entered wrong pwd");
	      }
		}
		else 
		{
		System.out.println ("You have entered wrong UID OR pwd");	
		}
			
		}
		
	 public static void main (String [] args )
    {
      Z k = new Z();
      k.m5();
    	
    }
}
