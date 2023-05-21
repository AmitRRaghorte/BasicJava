package task;

import java.util.Scanner;

public class ScannerLogind {

	

		public void login (){

		String user = "admin";
		String pwd = "password";

		Scanner sc = new Scanner (System.in);

		System.out.println ("Enter userid");
		String userinput = sc.nextLine ();
		System.out.println (userinput);

		System.out.println ("Enter password");
		String passwordinput = sc.nextLine ();
		System.out.println (passwordinput);


		if (userinput.equals (user) && passwordinput.equals (pwd)) 
		{
		  System.out.println ("Welcome to Isha");
		}
		else 
		{
		  System.out.println ("You have entered wrong pwd or userid");

		}
		}
		public static void main (String [] args ){

		ScannerLogind s = new ScannerLogind ();
		s.login ();
		}
		}

