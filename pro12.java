import java.util.Scanner;

public class pro12 {

    public static void main(String[] args) {

        int num;
        Scanner s = new Scanner(System.in);

        System.out.println("enter number :");
        num = s.nextInt();

        while (num <= 50) {
            System.out.printf("value : %d\n",num);
            num++;
        }
    }
}