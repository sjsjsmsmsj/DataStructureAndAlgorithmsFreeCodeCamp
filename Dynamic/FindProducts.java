public class FindProducts {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        int result[] = findProducts(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
    public static int[] findProducts(int arr[]) {
        int temp = 1;
        int result[] = new int[arr.length];
        for (int i = 0; i < result.length; i ++) {
            result[i]  = temp;
            temp *= arr[i];
        }
        int temp1 = 1;
        for (int j = result.length - 1; j >= 0; j --) {
            result[j] = result[j] * temp1;
            temp1 *= arr[j];
        }
        return result;
    }
}
