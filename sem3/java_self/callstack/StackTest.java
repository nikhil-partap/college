public class StackTest {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("1. Main Start");
        alpha(x);
        System.out.println("2. Main End");
    }

    public static void alpha(int a) {
        int b = a + 5;
        System.out.println("3. Alpha processing: " + b);
        beta(b);
        System.out.println("4. Alpha Done");
    }

    public static void beta(int c) {
        int d = c * 2;
        System.out.println("5. Beta final value: " + d);
    }
}