import java.util.Scanner;

public class pro15 {
    public static void main(String[] args) {
        int i, j;
        final int SIZE = 5;
        float price[] = new float[SIZE];
        Scanner my = new Scanner(System.in);

        for (i = 0; i < SIZE; i++) {
            System.out.print("enter your number :");
            price[i] = my.nextFloat();
        }

        for (j = 0; j < SIZE; j++) {
            System.out.printf("my value no %d is : %.2f\n ",j, price[j]);
        }
    }
}