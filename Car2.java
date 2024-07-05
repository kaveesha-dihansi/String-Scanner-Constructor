public class Car2 {
int year;
char model;
String name;
Car2() {
System.out.println("Inside Constructor.");
}
public static void main (String[] args) {
Car2 myCar = new Car2(); // Invokes the default constructor
System.out.println(myCar.year); // The default constructor assigns
System.out.println(myCar.model); // defaults values like 0, '\0', null
System.out.println(myCar.name); // to the class variables
}
}