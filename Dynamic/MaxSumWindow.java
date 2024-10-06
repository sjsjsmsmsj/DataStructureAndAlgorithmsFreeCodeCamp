public class MaxSumWindow {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 3, 5, 8, 1 };
        System.out.println(maxSumWindow(arr, 3));
    }
    public static int maxSumWindow(int arr[], int k) {
        int maxSum = 0;
        int window = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end ++) {
            window = window + arr[end];
            if (end >= k - 1) {
                if (maxSum < window) {
                    maxSum = window;
                }
                window = window - arr[start ++];
            }
        }
        return maxSum;
    }
}
