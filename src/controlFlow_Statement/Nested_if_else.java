package controlFlow_Statement;

public class Nested_if_else {
	
	public void t1 () {
		
		String name = "admin";
		String pwd = "password";
		
		if (name=="admin" ) {
	    if (pwd=="password") {
	    	System.out.println ("Welcoe to isha");
	    }else {
	    	System.out.println ("You have neterede worng password");
	    }}
		else {
			System.out.println ("You have entered wrong name or pwd");
		}
	}
	
	public static void main (String [] args ) {
		Nested_if_else  k = new Nested_if_else  ();
		k.t1();
	}

}
