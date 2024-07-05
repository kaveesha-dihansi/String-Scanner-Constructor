public class StringMethods {

    public static void main(String[] args) {

        String name = "Uva Wellassa University";

        System.out.println(name.charAt(2));
        System.out.println(name.contains("ell"));
        System.out.println(name.indexOf('s'));
        System.out.println(name.lastIndexOf('y'));
        System.out.println(name.trim().toLowerCase());
        System.out.println(name.trim().toUpperCase());
        System.out.println(name.length());
        System.out.println(name.trim().length());
    }
}