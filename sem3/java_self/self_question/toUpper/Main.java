package self_question.toUpper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            
            char ch = str.charAt(i);

            char upper = (char) (ch - 'a' + 'A');
            
            result.append(upper);
        }

        System.out.println(result);
    }
}
