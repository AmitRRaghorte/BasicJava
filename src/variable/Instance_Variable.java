package variable;

public class Instance_Variable {
      int i = 50;// INSTANCE Variable always declared inside non-static method
      int o = 35;//  INSTANCE Variable 
   public void substration ()
   {
	   int p = i-o;
	   System.out.println (p);
	   
   }
   
   public void addition ()
   
   {
	 int s = i + o ;
	 System.out.println (s);
			
   }
   
   public static void main (String [] args)
   {
	   Instance_Variable r = new Instance_Variable ();
	   r.substration();
	   r.addition();
   }
}
