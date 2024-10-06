import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SlidingWindows {
    public static void main(String[] args) {
        int arr[] = { 44, 77, 33, 44, 88, 11 };
        List<Integer> list = maxSlidingWindows(arr, 3);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static int[] nextGreaterElements(int arr[]) {
        int [] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i --) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = arr.length;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
    public static List<Integer> maxSlidingWindows(int arr[], int k) {
        int nge[] = nextGreaterElements(arr);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i ++) {
            int j = i;
            while (nge[j] < k + i) {
                j = nge[j];
            }
            list.add(arr[j]);
        }
        return list;
    }
}
