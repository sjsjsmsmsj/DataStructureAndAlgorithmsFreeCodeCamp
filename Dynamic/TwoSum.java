
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        int arr[] = { 2, 11, 5, 10, 7, 8 };
        int result[] = twoSum(arr, 9);
        for (int x : result) {
            System.out.println(x);
        }
    }
    public static int[] twoSum(int arr[], int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i ++) {
            if (hashMap.containsKey(target - arr[i])) {
                result[0] = i;
                result[1] = hashMap.get(target - arr[i]);
                return result;
            }
            hashMap.put(arr[i], i);
        }
        return result;
    }
    public static int[] twoSumV2(int arr[], int target) {
        Arrays.sort(arr);
        int result[] = new int[2];
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                left ++;
            }
            if (sum > target) {
                right --;
            }
            if (sum == target) {
                result[0] = left;
                result[1] = right;
                return result;
            }
        }
        return result;
    }
}