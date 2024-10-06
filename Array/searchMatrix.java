import java.util.Scanner;

public class searchMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Please input a integer: ");
        n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n;j ++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        search(matrix, n, 32);
    }
    public static void search(int matrix[][], int n, int x) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                System.out.println("x found row = " + i + ", column = " + j) ;
                return ;
            } 
            if (matrix[i][j] > x) {
                j --;
            } else {
                i ++;
            }
        }
        System.out.println("Not found");
    }
}
