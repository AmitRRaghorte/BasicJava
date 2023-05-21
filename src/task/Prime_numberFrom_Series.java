package task;

public class Prime_numberFrom_Series {  // Print Number from 10 t0 50 ; 
	// prime no is no which is divisible by 1 and itselt and give remainder 0.
	
	    public static void main(String[] args) {
	        int start = 10;
	        int end = 50;

	        System.out.println("Prime numbers between " + start + " and " + end + " are:");
	        for (int number = start; number <= end; number++) {
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

// In this program, the range of numbers is set from 10 to 50 using the start and end variables.
//The isPrime method is used to check whether a number is prime or not. 
//It iterates from 2 to the square root of the number and checks 
//if the number is divisible by any of those values. If it is divisible, then the number is not prime. 
//If none of the values divide the number evenly, it is considered prime.

//The main method loops through the range of numbers and calls the isPrime method for each number. 
//If a number is prime, it is printed on the console.

//When you run the program, it will display the prime numbers between 10 and 50, 
//which are 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, and 47.
