
public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 20, 25, 30, 300};
        System.out.println(binarySearching(arr, arr.length, 300));
    }
    public static int binarySearching(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } 
            if (arr[mid] < x) {
                low = mid + 1;
            } else  {
                high = mid - 1;
            }
        }
        return -1;
    }
}
