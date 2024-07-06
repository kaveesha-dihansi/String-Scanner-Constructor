import java.util.Scanner;

public class pro6 {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);

        System.out.print("enter your age :");
        age = s.nextInt();

        if(age > 18) {
            System.out.println("you can vote");
        }
        else {
            System.out.println("you can't vote");
        }
    }
}