
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Triangle(5, 4);
        Shape s2 = new Rectangle(4, 6);

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
