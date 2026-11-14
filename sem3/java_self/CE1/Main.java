import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid = 2 * n - 1;
        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {
                int top = i + 1;
                int left = j + 1;
                int bottom = grid - i;
                int right = grid - j;

                int dis = Math.min(Math.min(top, bottom), Math.min(right, left));
                System.out.print(dis);
            }
            System.out.println();
        }
    }
}
