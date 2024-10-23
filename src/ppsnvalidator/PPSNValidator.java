/*
 * Default comments added by the IDE when creating the project
 */
package ppsnvalidator; // Declares the package ppsnvalidator for organizing the classes

import java.util.Scanner; // Imports the Scanner class for user input

/**
 *
 * @author jhane
 */
public class PPSNValidator { // The main class for the PPSN Validator program

    /**
     * The main method, entry point of the application
     * @param args the command line arguments
     */
    public static void main(String[] args) { // Main method that runs the application
        // Declare a variable to store the user's input PPSN (Personal Public Service Number)
        String userPPSN = "";
        // Create a Scanner object to read input from the console
        Scanner myScanner = new Scanner(System.in);

        // Prompt the user to enter their PPSN
        System.out.println("Please enter your PPSN:");
        
        try {
            // Read the PPSN input from the user and assign it to userPPSN
            userPPSN = myScanner.nextLine();
            // Remove any leading or trailing whitespace from the input
            userPPSN = userPPSN.trim();

            // Check if the length of the PPSN is either 8 or 9 characters
            if (userPPSN.length() == 8 || userPPSN.length() == 9) {
                // If the length is valid (8 or 9 characters):
                
                // Extract the first seven characters (should be digits)
                String firstSeven = userPPSN.substring(0, 7);
                // Extract the last part (should be 1 or 2 letters)
                String lastBit = userPPSN.substring(7);
                
                // Check if the last part contains only letters and the first seven characters are digits
                if ((lastBit.matches("[A-Za-z]+")) && firstSeven.matches("[0-9]+")) {
                    // If both conditions are true, the PPSN is valid
                    System.out.println("Thank you " + userPPSN + " is a valid PPSN.");
                } else {
                    // If the format is incorrect (not 7 digits followed by 1-2 letters)
                    System.out.println("Invalid - you must have 7 digits followed by 1 or 2 letters.");
                }
                
            } else {
                // If the length is not valid (not 8 or 9 characters)
                System.out.println("Invalid PPSN - must be 8 or 9 characters");
            }
        } catch (Exception e) {
            // Catch any unexpected exceptions (empty catch block, so it does nothing)
        }
    }
}
