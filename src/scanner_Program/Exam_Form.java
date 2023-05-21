package scanner_Program;

import java.util.Scanner;

public class Exam_Form {

	public void exam () {
	
	System.out.println ("**************Persnal Details ***************");	
	System.out.println ("Enter Your Details");	
	System.out.println ("Enter Name");	
	
	// Scanner objrefvariable = new Scanner (System.in);
	// Datatype variable = objrefvariable.method ();
	
	Scanner sc = new Scanner (System.in);
	String name = sc.nextLine ();
	System.out.println ("Applicant Name :"+name);
	
	System.out.println ("Enter Mob no");
	long mob = sc.nextLong ();
	System.out.println ("Mon NO :"+mob);
	
	System.out.println ("Enter section");
	String section = sc.nextLine();
	System.out.println ("Section:"+section);
	
	
	sc.close ();
	
	
	
	}
	
	public static void main (String [] args ) {
		Exam_Form v = new Exam_Form ();
		v.exam ();
	}
}
