public class Hostel {
    float length;
    float width;

    Hostel(float l, float w) {
        length = l;
        width = w;

    }

    public static void main(String[] args) {
        Hostel sappire = new Hostel(1244f, 3477f);
        Hostel ruby = new Hostel(345.77f, 7832f);

        System.out.println("the ruby hostel area is :" + ruby.length * ruby.width);
    }
}