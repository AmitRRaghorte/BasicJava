package controlFlow_Statement;

public class Switch_Statement {

	public void m5 ()
	{
	
	int month = 10 ;
	
	switch (month) {
	case 1 : System.out.println ("January");break;
	case 2 : System.out.println ("FEB");break;
	case 3 : System.out.println ("Mar");break;
	case 4 : System.out.println ("APRIL");break;
	case 5 : System.out.println ("MAY");break;
	case 6 : System.out.println ("JUNE");break;
	case 7 : System.out.println ("JULY");break;
	case 8 : System.out.println ("AUG");break;
	case 9 : System.out.println ("SEP");break;
	case 10 : System.out.println ("OCT");break;
	case 11 : System.out.println ("NOV");break;
	case 12 : System.out.println ("DEC");break;
	default : System.out.println ("Invalid data provided");
}
	
	}
	public static void main (String [] args)
	{
		Switch_Statement s = new Switch_Statement ();
		s.m5();
	}
}
