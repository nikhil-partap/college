import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        Scanner sc = new Scanner(System.in);
        
        row = sc.nextInt();
        col = sc.nextInt();

        int[][] mat = new int[row][col];
        
        int row_sum[] = new int[row] ;
        for(int i = 0; i < row; i++){
            int in_sum = 0;
            for(int j =0; j < col; j++){z
                in_sum += mat[i][j];
            }
            row_sum[i] = in_sum;
        }

        int col_sum[] = new int[col];
        for(int i = 0; i < row; i++){
            int in_sum = 0;
            for(int j =0; j < col; j++){
                in_sum += mat[i][j];
            }
            col_sum[i] = in_sum;
        }
    }
}
