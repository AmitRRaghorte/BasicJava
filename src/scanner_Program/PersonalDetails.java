package scanner_Program;

import java.util.Scanner;

public class PersonalDetails {
	
	public void t1 () {
		
		System.out.println ("**********Personal_Details**********");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Enter Full name");
		String name =sc.nextLine();
		System.out.println ("Full Name : " + name);
		
		System.out.println ("Enter Date of Birth");
		String dob = sc.nextLine();
		System.out.println ("Date of Birth : " + dob);
		
		System.out.println ("Enter City name");
		String city =sc.nextLine ();
		System.out.println ("City : " + city);
		
		
	}
	
	public static void main (String [] args) {
		PersonalDetails p = new PersonalDetails ();
		p.t1();
	}

}
