public class Main {
    static int divide(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("error cannot divide by zero! " + e.getMessage());
            return 0;
        }finally{
            System.out.println("division attempted");
        }
    }
    public static void main(String[] args) {
        divide(3, 0);
    }

}
