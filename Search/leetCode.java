


public class leetCode {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 5, 7 };
        System.out.println(binarySearch(arr, 0));
    }
    public static int binarySearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
