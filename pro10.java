public class pro10 {

    enum Colour {
        RED,BLUE,GREEN
    }

    public static void main(String[] args) {
        Colour my =  Colour.RED;
        switch(my) {
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            default:
                System.out.println("no colour");
        }

   
    }
}