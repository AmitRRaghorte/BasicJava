package scanner_Program;

import java.util.Scanner;

public class Survey {

public void m5 () {

System.out.println ("Enter Population survey Details");

Scanner sc = new Scanner (System.in);

System.out.println ("Enter full name");
String name = sc.nextLine ();
System.out.println ("Enter name : "+name); 

System.out.println ("Family Member");
int member = sc.nextInt ();
System.out.println ("Family Member :"+member);

System.out.println ("Nation");
String nation = sc.nextLine ();
System.out.println ("Nation :"+nation);

sc.close ();

}

public static void main (String [] args) {

Survey s = new Survey ();
s.m5 ();

}


}
