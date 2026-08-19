
public class Main {
    public static void main(String[] args) {
        String s = "java programming";

        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb.length());
        
        System.out.println(s.toUpperCase());

        System.out.println(s.contains("program"));

        s = s.replace("java", "Java");
        System.out.println(s);

        System.out.println(sb.reverse());

        String a = "hello";
        String b = new String("hello");

        if(a.equals(b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if(a == b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        
        
    }
}
