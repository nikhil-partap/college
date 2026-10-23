import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nos = new int[n];
        for (int i = 0; i < n; i++) {
            nos[i] = sc.nextInt();
        }
        int split = (n + 1) / 2;
        for (int i = 00; i < split; i++) {
            System.out.print(nos[i] + " ");
        }
        for (int i = n - 1; i >= split; i--) {
            System.out.print(nos[i] + " ");
        }
    }
}
