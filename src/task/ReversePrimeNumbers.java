package task;

public class ReversePrimeNumbers {
	
	    public static void main(String[] args) {
	        int start = 10;
	        int end = 50;

	        System.out.println("Reverse prime numbers between " + start + " and " + end + " are:");
	        for (int number = end; number >= start; number--) {
	            if (isPrime(number)) {
	                System.out.print(number + " ");
	            }
	        }
	    }

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}

  // This program is similar to the previous one that finds prime numbers, but instead,
//it starts from the end number and iterates in reverse order, checking each number if it 
//is prime using the isPrime method.

// When you run the program, it will display the reverse prime numbers between 10 and 50:
//Reverse prime numbers between 10 and 50 are:
//47 43 41 37 31 29 23 19 17 13 11



