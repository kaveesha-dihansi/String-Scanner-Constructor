import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter the character to be counted
        System.out.print("Enter a character to count: ");
        char charToCount = scanner.next().charAt(0);

        // Count the occurrences of the specified character in the input string
        int count = countOccurrences(inputString, charToCount);

        // Display the result
        System.out.println("The character '" + charToCount + "' appears " + count + " times in the string.");

        // Close the scanner
        scanner.close();
    }

    // Method to count the occurrences of a specific character in a string
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}



 