
public class search {
    public static void main(String args[]) {
        int arr[] = { 5, 1, 9, 2, 10, 15, 20 };
        System.out.println(searching(arr, arr.length, 15));
    }
    public static int searching(int arr[], int n, int x) {
        for (int i = 0; i < n; i ++) {
            if (arr[i] == x) {
                return x;
            }
        }
        return -1;
    }
}
