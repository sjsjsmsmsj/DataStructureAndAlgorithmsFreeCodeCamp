// Dynamic programming 
/*
 * 1. Breaking it into smaller sub-problems
 * 2. Solving those sub-problems and storing their results
 * 3. Reuse those stored results if sub-problems occurs/ overlaps (avoid solving sub-problems)
 * 4. Finally using solutions to smaller problems build up solution to complex problem
 */
public class Fibonaci {
    public static void main(String[] args) {
        System.out.println(fibonaci(10));
    }
    public static int fibonaci(int n) {
        int fib[] = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i ++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
    public static int fib(int m[], int n) {
        if (m[n] == 0) {
            if (n < 2) {
                m[n] = n;
            } else {
                int left = fib(m, n - 1);
                int right = fib(m, n - 2);
                m[n] = left + right;
            }
        }
        return m[n];
    }
}
