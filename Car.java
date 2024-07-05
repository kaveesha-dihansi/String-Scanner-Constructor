public class Car {
    int year;
    char model;
    String name;

    Car() {
        System.out.println("inside constructor");
    }

    public static void main(String[] args) {
        Car my = new Car();
        System.out.println(my.year);
        System.out.println(my.model);
        System.out.println(my.name);
    }
}