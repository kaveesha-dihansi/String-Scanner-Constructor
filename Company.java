public class Company {
   int year;
   char model;
   String name;
Company() {
   System.out.println("Inside Constructor.");
}
public static void main (String[] args) {
     CaCompany myCar = new Company(); // Invokes the default constructor
     System.out.println(myCar.year); // The default constructor assigns
     System.out.println(myCar.model); // defaults values like 0, '\0', null
     System.out.println(myCar.name); // to the class variables
}
}