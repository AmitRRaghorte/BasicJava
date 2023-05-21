package scanner_Program;

import java.util.Scanner;

public class ScannerClass1 {
	
	
	public void test () {
		
		System.out.println ("**********************AADHARCARD DETAILS*******************");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Enter full Name");
		String fullname = sc.nextLine ();
		System.out.println (" full name"+fullname);
		
		System.out.println ("Enter MobNo");
		Long mobno =sc.nextLong ();
		System.out.println ("MobNo :"+ mobno);
		
		System.out.println ("Enter City");
		String city =sc.next ();
		System.out.println ("city :" + city);
		
		System.out.println ("Enter Stream");
		Long stream = sc.nextLong ();
		System.out.println ("Stream" + stream);
		
		sc.close ();
		
		
	}
	
	public static void main (String [] args) {
		
		ScannerClass1 s = new ScannerClass1 ();
		s.test ();
		
	}

}
