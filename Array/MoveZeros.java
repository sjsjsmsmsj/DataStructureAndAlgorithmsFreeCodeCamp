

public class MoveZeros {
    public  void main(String args[]) {
        int arr[] = { 8, 1, 0, 2, 1, 0, 3 };
        moveZeros(arr, arr.length);
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
    public  void moveZeros(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n; i ++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            if (arr[j] != 0) {
                j ++;
            }
        }
    }
}
