public class RemoveElements {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 2, 3 };
        System.out.println(removeElements(arr, 2));
    }
    public static int removeElements(int arr[], int val) {
        int i = 0;
        for (int j = 0; j < arr.length; j ++) {
            if (arr[j] != val) {
                arr[i ++] = arr[j];
            }
        }
        return i;
    }
}
