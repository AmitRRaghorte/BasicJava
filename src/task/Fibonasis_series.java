package task;

public class Fibonasis_series {

	    public static void main(String[] args) {
	        int n1 = 0, n2 = 1, nextTerm = 0;

	        System.out.println("Fibonacci series from 1 to 100:");

	        while (nextTerm <= 100) {
	            System.out.print(nextTerm + " ");

	            n1 = n2;
	            n2 = nextTerm;
	            nextTerm = n1 + n2;
	        }
	    }
	}

  //In this program, we initialize three variables n1, n2, and nextTerm to store the values of the Fibonacci 
//sequence. We start with n1 and n2 as 0 and 1 respectively.
//We use a while loop to generate the Fibonacci series until the nextTerm exceeds 100. 
//In each iteration of the loop, we print the nextTerm, update n1 to the value of n2, n2 
//to the value of nextTerm, and calculate the nextTerm as the sum of n1 and n2.
//When you run the program, it will display the Fibonacci series from 1 to 100:

//Note that the Fibonacci series starts with 0 and 1, and each subsequent term is the
//sum of the previous two terms
