public class Stock {
    int year;
    char model;
    String name;

    Stock(int x, char y,String z) {
        System.out.println("inside constructor");
        year = x;
        model = y;
        name = z;
        
    }
    public static void main(String[] args) {
        Stock my = new Stock(1998,'L',"BMW");
        System.out.println(my.year);
        System.out.println(my.model);
        System.out.println(my.name);
    }
}