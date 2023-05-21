package scanner_Program;

import java.util.Scanner;

public class Login_Functinality {
	
	        public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Set the username and password
	        String username = "admin";
	        String password = "password";

	        System.out.println("Please enter your username:");
	        String inputUsername = scanner.nextLine();

	        System.out.println("Please enter your password:");
	        String inputPassword = scanner.nextLine();

	        // Check if the entered username and password match the expected values
	        if (inputUsername.equals(username) && inputPassword.equals(password)) {
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Invalid username or password. Please try again.");
	        }

	        // Close the scanner
	        scanner.close();
	        }
}
	
