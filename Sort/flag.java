public class flag {
    public static void main(String args[]) {
        int arr[] = { 2, 0, 2, 2, 0, 1, 1 };
        int[] temp = sortColorsFlag(arr);
        for (int x: temp) {
            System.out.print(x + " ");
        }
    }
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] sortColorsFlag(int arr[]) {
        int i = 0; // mark 1
        int j = 0; //mark 0
        int k = arr.length - 1; // mark 2
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i ++;
                j ++;
            } else if (arr[i] == 1) {
                i ++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k --;
            }
        }
        return arr;
    }
}
