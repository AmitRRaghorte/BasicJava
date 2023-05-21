package task;

public class PrimeNumberCheckers {
	
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

	    public static void main(String[] args) {
	        int number = 5 ;

	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}


//In this code, the isPrime method takes an integer number as input and checks if it is 
//a prime number using a similar logic as explained before. It returns true if the number is prime,
// and false otherwise.

//In the main method, we initialize the number variable with a value of 17 
//(you can change it to any other number you want to check). 
//We then call the isPrime method for that number and print the appropriate message to the console.