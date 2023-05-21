package task;

public class EvenNumberseries { // Print even number from 1 to 50 
	
	    public static void main(String[] args) {
	        int start = 1;
	        int end = 50;

	        System.out.println("Even numbers between " + start + " and " + end + " are:");
	        for (int number = start; number <= end; number++) {
	            if (number % 2 == 0) {
	                System.out.print(number + " ");
	            }
	        }
	    }
	}

 //In this program, we set the start and end variables to define the range from 1 to 50. 
//The program then uses a for loop to iterate through the numbers within that range. 
//For each number, it checks if the number is divisible evenly by 2 (i.e., if the remainder is 0).
//If it is, the number is even and gets printed to the console.
