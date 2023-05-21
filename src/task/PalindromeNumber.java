package task;

public class PalindromeNumber {
	
	    public static boolean isPalindrome(int number) {
	        int reversedNumber = 0;
	        int originalNumber = number;

	        while (number != 0) {
	            int remainder = number % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            number /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }

	    public static void main(String[] args) {
	        int number = 12321;

	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	    }
	}


  //n this code, the isPalindrome method takes an integer number as input and checks if it is a palindrome.
 //It does this by reversing the number and comparing it with the original number. 
 //If the reversed number is equal to the original number, then the number is a palindrome.

 //In the main method, we initialize number with a sample value of 12321 and call the isPalindrome method 
 //to check if it is a palindrome. The result is then printed to the console.
  //You can modify the number variable in the main method to test different numbers for palindrome checking.
