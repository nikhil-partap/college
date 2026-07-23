class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    static String add(String a, String b) {
        return a + b;
    }
}

public class FunctionOverloading {  
    // Calculator calc = new Calculator();

    public static void main(String[] args) {
        Calculator.add(5, 10); // calls the add(int, int) method
        Calculator.add(5.5, 10.5); // calls the add(double, double) method    
        Calculator.add("Hello, ", "World!"); // calls the add(String, String) method
    }
}
