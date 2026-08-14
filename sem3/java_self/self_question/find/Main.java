import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);

        String str = sc.nextLine();
        int c =0;
        for(int i = 0; i < str.length(); i++){00
            if(str.charAt(i) == ch){
                c++;
            }
        }
        System.out.println(c);
    }
}
