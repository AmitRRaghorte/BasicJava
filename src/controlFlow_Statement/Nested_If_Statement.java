package controlFlow_Statement;

public class Nested_If_Statement {


		public void m5 ()
		{

		   int age = 45 ;
		   int weight =  60 ;

		if (age < 45) {

		System.out.println ("Your eligible for blood donation");

		if (weight > 55) {
		System.out.println ("Weight is ok");

		}

		}
		System.out.println ("Not eligible for blood donation");
		}

		public static void main (String [] args) 
		{
			Nested_If_Statement  s = new  Nested_If_Statement ();
		         s.m5 ();

		}
		}

