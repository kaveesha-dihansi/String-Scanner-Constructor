public class Office {
    int salary;
    String employeeName;

    Office() {
        salary = 90000;
        employeeName = "sampath";

    }

    public static void main(String[] args) {
        Office my = new Office();
        System.out.println(my.salary);
        System.out.println(my.employeeName);
    }

}