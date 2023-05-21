package task;

public class PalimdromeNumberFromseries { // Print Palimdrome number from 1 to 100 .
	
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
	        System.out.println("Palindrome numbers from 1 to 100:");

	        for (int i = 1; i <= 100; i++) {
	            if (isPalindrome(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	}



