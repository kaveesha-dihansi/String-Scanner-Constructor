import java.util.Scanner;

public class pro3 {

    public static void main(String[] args) {
        int year;
        float cost;
        String model;
        Scanner s = new Scanner(System.in);

        System.out.print("enter your year :");
        year = s.nextInt();
        System.out.print("enter your cost :");
        cost = s.nextFloat();
        System.out.print("enter your model :");
        model = s.next();

        System.out.printf("my year is %d my cost is %f my model is %s", year, cost, model);
    }
}