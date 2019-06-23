package ch16pc05;

import java.util.Scanner;

/**
 * Palindrome Detector
 * Determine if user input text is a palindrome
 * @author frank
 */
public class Ch16pc05 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String text;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request user input
        System.out.println("Welcome the Palindrome Detector");
        System.out.print("Please enter the text you want to check: ");
        text = keyboard.nextLine();
        
        // Determine if the text is a palindrome and display results to the user
        if (isPalindrome(text))
            System.out.println("The text you input '" + text + "' is a palindrome.");
        else
            System.out.println("The text you input '" + text + "' is not a palindrome.");
        
        System.out.println("Isn't it funny that palindrome is not a palindrome?");
    }
    
    /**
     * Determine if a string is a palindrome
     * @param string String The string to be verified
     * @return boolean True if palindrome; false otherwise
     */
    private static boolean isPalindrome(String string) {
        if (string.length() <= 1)
            return true;    // One letter words are considered a palindrome
        
        if (string.charAt(0) == string.charAt(string.length()-1))
            return isPalindrome(string.substring(1, string.length() - 1));
        else
            return false;
    }

}
