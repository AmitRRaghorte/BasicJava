package basic_Practised;

public class P1 {

	int a ;
	int b ;
	public void m5 ()
	{
		a = 100;
		b = 20 ;
		System.out.println (a/b); // 5
		System.out.println (a%b); // 0
		System.out.println (b/a); // 0
		System.out.println (b%a); //20
		System.out.println (a++); //100
		System.out.println (++a); //102
		System.out.println (-a); //-102
		System.out.println (+a); //+102
		System.out.println (--a); //101
		System.out.println (b++); //20
		System.out.println (++a);  //102
		System.out.println (b);  //21
	}
	public static void main (String [] args)
	{
		P1 p = new P1 ();
		p.m5 ();
	}
}
