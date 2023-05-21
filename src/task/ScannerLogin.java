package task;

import java.util.Scanner;

public class ScannerLogin {
	
	
		
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
		        if (inputUsername.equals(username)&& inputPassword.equals (password)) {
		            System.out.println("Login successful!");
		        } else {
		            System.out.println("Invalid username or password. Please try again.");
		        }

		        // Close the scanner
		        scanner.close();
		        }
	}

//In this program, we create a Scanner object to read user input from the console.
//The expected username and password are set to "admin" and "password" respectively. 
//The program prompts the user to enter their username and password, 
//and then compares the entered values with the expected ones.
//If they match, it prints "Login successful!"; otherwise, it prints "Invalid username or password. 
//Please try again."

//Remember to compile and run the program using a Java compiler or integrated development environment (IDE) 
//of your choice
		



