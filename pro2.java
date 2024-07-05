import java.util.Scanner;

public class pro2 {

    public static void main(String[] args) {
        int x1, x2;
        Scanner s = new Scanner(System.in);

        System.out.print("enter your 1st no :");
        x1 = s.nextInt();
        System.out.print("enter your 2nd no :");
        x2 = s.nextInt();
        System.out.println("the sum is " + (x1 + x2));
    }
}