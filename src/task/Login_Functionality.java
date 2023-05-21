package task;

public class Login_Functionality { // Write program for login functionality
	
	

		public void login ()
		 {
		   String UID = "amitraghorte@gmail.com";
		   String PWD = "amit@500";

		  if (UID == "amitraghorte@gmail.com") {
		  if (PWD == "amit@500") 
		  {
		  System.out.println ("Welcome to Facebook");
		  }
		  else 
		  {
		   System.out.println ("You have entred wrong PWD");
		  } 
		  } else 
		  
		  {
		  System.out.println ("You have entered wrong UID ");

		  }


		 }

		public static void main (String [] args) 
		{
		   Login_Functionality l = new Login_Functionality ();
		    l.login ();
		}
		}


