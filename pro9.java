import java.util.Scanner;

public class pro9 {
    public static void main(String[] args) {

        char colour;
        Scanner s = new Scanner(System.in);

        System.out.print("enter your input :");
        colour = s.next().charAt(0);

        switch (colour) {

            case 'r':
            case 'R':
                System.out.println("red");
                break;

            case 'b':
            case 'B':
                System.out.println("blue");
                break;

            default:
                System.out.println("no colour");
        }
        s.close();
    }
}