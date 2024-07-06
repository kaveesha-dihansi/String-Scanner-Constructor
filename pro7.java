import java.util.Scanner;

public class pro7 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("enter your number :");
        num = s.nextInt();

        switch (num) {
            case 1:
                System.out.println("you entered one");
                break;
            case 2:
                System.out.println("you entered two");
                break;
            case 3:
                System.out.println("you entered three");
                break;
            default :
                System.out.println("you entered different no");
                 

        }
    }
}