import java.util.Scanner;

public class pro8 {
    public static void main(String[] args) {
        String ch;
        Scanner s = new Scanner(System.in);

        System.out.print("enter your input :");
        ch = s.nextLine();

        switch (ch.toUpperCase()) {
            case "JAVA":
                System.out.println("you like java");
                break;
            case "python":
                System.out.println("you like python");
                break;
            case "c++":
                System.out.println("you like c++");
                break;
            default:
                System.out.println("you can't like progamming languages");
        }

    }
}