public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 10, 1, 8, 6, 7, 4 };
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void merge(int arr[], int temp[], int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
    }
    
    public static void mergeSort(int arr[], int temp[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }
}
