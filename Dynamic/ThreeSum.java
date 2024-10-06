import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 7, 1, 8 ,9, 0 };
        threeSum(arr, 6);
    }
    public static void threeSum(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (j < k && i < k) {
            int sum = arr[i] + arr[j] + arr[k];
            if (sum > target) {
                k --;
            } else if (sum < target) {
                j ++;
            } else {
                System.out.println("{" + arr[i] + ", " + arr[j] + ", " + arr[k] + "}");
                i ++;
                k --;
            }
        }
    }
}
