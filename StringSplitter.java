import java.util.Scanner;

public class StringSplitter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter the delimiter
        System.out.print("Enter the delimiter: ");
        String delimiter = scanner.nextLine();

        // Split the input string based on the specified delimiter
        String[] substrings = inputString.split(delimiter);

        // Display the substrings
        System.out.println("The substrings are:");
        for (String substring : substrings) {
            System.out.println(substring);
        }

        // Close the scanner
        scanner.close();
    }
}
