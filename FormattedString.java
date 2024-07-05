public class FormattedString {
    public static void main(String[] args) {

        int x = 23;
        float y = 56.22f;
        char k = 'u';
        String doc;

        System.out.printf("my age is : %d\n", x);
        System.out.printf("charactor  is : %c\n", k);
        System.out.printf("my decimal no is : %.2f\n", y);
        doc = String.format("my no is : %d my decimal no is : %f my character is : %c ",x,y,k);

        System.out.println(doc);
    }
}