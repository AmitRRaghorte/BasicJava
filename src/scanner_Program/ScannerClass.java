package scanner_Program;

import java.util.Scanner;

public class ScannerClass {
	
	public void t1 () {
		Scanner s = new Scanner (System.in);
		
		System.out.println ("Enter emial");
		String emial = s.next ();
		
		System.out.println ("Enter Mobile Number");
		int mob = s.nextInt ();
		
		s.close ();
		
		
	}
	
	public static void main (String [] args) {
		ScannerClass t = new ScannerClass ();
		t.t1();
	}

}
