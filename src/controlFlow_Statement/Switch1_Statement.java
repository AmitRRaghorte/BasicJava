package controlFlow_Statement;

public class Switch1_Statement {

	public void m5 () {
		
		int age = 18 ;
		
		switch (age) {
		case 15 : System.out.println ("your not eligible");break;
		case 16 : System.out.println ("not eligible");break;
		case 17 : System.out.println ("not eligible");break;
		case 18 : System.out.println ("Congratulations your eligible for blood donation");break;
		case 19 : System.out.println ("NOT eligible");
		default :System.out.println ("Invalid data provide");
		}
	}
	public static void main (String [] args)
	{
		Switch1_Statement k = new Switch1_Statement ();
		k.m5 ();
	}
	
	
}
