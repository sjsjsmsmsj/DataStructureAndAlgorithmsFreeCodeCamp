public class SelectionSort {
    // analysis
    // array : 1 3 5 4 2 
    // idea select min, two min, three min, four min, max
    // i thought 1 interator for (0 -> n - 1)
    // execute: i will select min to me brought in front of
    // how to code: i will variable name: min (run complete interator for i will place min)
    // i thought 1 interator for (i = 0 -> n - 2)
    // execute: i think after interator for i selected 1 number min
    public static void main(String args[]) {
        int arr[] = { 10, 4, 2, 6, 9, 100, 3};
        selectionSorting(arr);
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
    public static void selectionSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i ++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
