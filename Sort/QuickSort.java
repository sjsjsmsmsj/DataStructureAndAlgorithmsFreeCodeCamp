public class QuickSort {
    // quick sort: 
    // idea I need to choose pivot in the lesson I choose the last array
    // if (pivot > arr[place]) is swap 2 place i and place j
    // if (pivot < arr[place]) is i ++
    // completed interator while i will return j - 1 because it compare with itself should i return j - 1 
    public static int partion(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;
        while (i <= high) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j ++;
            }
            i ++;
        }
        return j - 1;
    }
    // idea I need to recursion 
    // I need to given idea divide and conquer
    // divide i need (low , partion - 1) and (partion + 1, high)
    // conquer (low, partion - 1) and (partion + 1, high)
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partion(arr, low, high);
            quickSort(arr, low, p - 1); 
            quickSort(arr, p + 1, high);
        }
    }
    public static void main(String args[]) {
        int arr[] = { 10, 2, 5, 9, 3, 4, 7, 8, 1 };
        quickSort(arr, 0, arr.length - 1);
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
    
}
