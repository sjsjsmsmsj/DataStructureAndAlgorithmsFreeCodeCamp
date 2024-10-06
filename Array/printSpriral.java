import java.util.Scanner;

public class printSpriral {
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
        printSpriralForArrayDimensional(matrix, n, n);
    }
    public static void printSpriralForArrayDimensional(int arr[][], int r, int c) {
       int k = 0, l = 0; // uses two pointers to run point new place ok
       while (k < r && l < c) {
            // left -> right
            for (int i = l; i < c; i ++) {
                System.out.print(arr[k][i] + " ");
            }
            k ++;
            // top -> bottom
            for (int i = k; i < r; i ++) {
                System.out.print(arr[i][c - 1]+ " ");
            }
            c --;
            // right -> left
            if (l < c) {
                for (int i = c - 1; i >= l; i --) {
                    System.out.print(arr[r - 1][i] + " ");
                }
                r --;
            }
            // bottom -> top
            if (k < r) {
                for (int i = r - 1; i >= k; i --) {
                    System.out.print(arr[i][l] + " ");
                }
                l ++;
            }
       }
    }
}
