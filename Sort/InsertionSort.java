
public class InsertionSort {
            // example: sorted array increase by insertion sort
        // arr[] = { 5, 1, 9, 2 , 10 };
        // start
        // i take variable to store integer i 
        // i think use interator for
        // for (1 -> n - 1) because i assume place 0 to sorted to compare after
        // arr[1] = 1
        // i takes arr[1] compares numbers to before place 1
        // 5 compare with 1 (5 > 1) 
        // arr[1] = 5
        // arr[0] = 1
        // after array = { 1, 5 , 9, 2, 10 };
        // ....
        // array = { 1, 5 , 9, 2, 10 };
        // arr[3] = 2
        // arr[3] compare numbers before
        // arr[3] compare with arr[2]
        // arr[3] = arr[2] 
        // arr[2] = arr[1]
        // arr[1] = arr[3]
        // after i alysis i think i need varible to j = i - 1
        // i use while (j >= 0 && arr[j] > arr[i]) 
        // i arr[j + 1] = arr[j]
        // j --
        // compare to complete arr[j + 1] = arr[i] 
    public static void main(String args[]) {
            int arr[] = { 10, 4, 2, 6, 9, 100, 3};
            insertionSorting(arr);
            for (int x: arr) {
                System.out.print(x + " ");
            }
    }
    public static void insertionSorting(int arr[]) {
        for (int i = 1; i < arr.length; i ++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = temp;
        }
    }
}
