package task;

public class ReverseString {
	
	
	    public static void main(String[] args) {
	        String input = "Hello, Amit RRaghorte!";
	        String reversed = reverseString(input);
	        System.out.println("Original string: " + input);
	        System.out.println("Reversed string: " + reversed);
	    }

	    public static String reverseString(String input) {
	        StringBuilder sb = new StringBuilder(input);
	        return sb.reverse().toString();
	    }
	}
 
//In this program, we define a reverseString method that takes an input string and returns its reversed form. 
// Inside the method, we create a StringBuilder object initialized with the input string. 
//We then use the reverse() method of StringBuilder to reverse the contents of the StringBuilder object. 
// Finally, we convert the reversed StringBuilder back to a string using the toString() method.

