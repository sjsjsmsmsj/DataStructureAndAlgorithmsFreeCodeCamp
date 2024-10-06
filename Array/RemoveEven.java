public class RemoveEven {
    public  void main(String[] args) {
        int arr[] = {3, 2, 4, 7, 10, 6, 5};
        int k[] = Even(arr);
        for (int x: k) {
            System.out.print(x + " ");
        }
    }
    public  int[] Even(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 != 0) {
                oddCount ++;
            }
        }
        int h[] = new int[oddCount];
        int x = 0; // intinalize x increasing when  element of h increasing
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 != 0) {
                h[x ++] = arr[i];
            }
        }
        return h;
    }
}