import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

         
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);

        System.out.println("The reversed string is: " + reversedString);

        scanner.close();
    }
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
