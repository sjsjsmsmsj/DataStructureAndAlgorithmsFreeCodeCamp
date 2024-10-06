
public class Resize {
    public  void main(String args[]) {
        int arr[] = {5, 9, 3, 10};
        resize(arr, 8);
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
    public  void resize(int arr[], int capacity) {
        int temp[] = new int[capacity];
        for (int i = 0; i < arr.length; i ++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
}
