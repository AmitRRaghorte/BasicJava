package keyword_This;

public class This_Keyword {

	String name1 = "Amit";
	String name2 = "Goku";
	
	public void m5 ()
	{
		String name1 = "Gohan";
		String name2 = "Vegeta";
		System.out.println (name1 +"\n"+name2);
		System.out.println (this.name1);
		System.out.println (this.name2);
	}
	
	public static void main (String [] args)
	{
		This_Keyword k = new This_Keyword ();
		k.m5 ();
		
	}
}
