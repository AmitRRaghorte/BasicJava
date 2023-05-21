package constructor;

public class Paramaterised_Constructor {

	Paramaterised_Constructor ()
	{
		System.out.println ("This zero constructor");
	}
	Paramaterised_Constructor (String name)
	{
		System.out.println ("1 argument");
	}
	Paramaterised_Constructor (String name , int a)
	{
		System.out.println ("2 argument");
	}
	Paramaterised_Constructor (String name ,int b,char c)
	{
		System.out.println ("3 argument");
	
	}
	public static void main (String [] args)
	{
		new Paramaterised_Constructor ();
		new Paramaterised_Constructor ("Amit");
		new Paramaterised_Constructor ("Amit",40);
		new Paramaterised_Constructor ("Surya",90,'@');
		
		}

}

