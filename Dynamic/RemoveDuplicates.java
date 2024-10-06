public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int arr[]) {
        int i = 0;
        int k = 0;
        for (int j = 1; j < arr.length; j ++) {
            if (arr[i] != arr[j]) {
                k ++;
                arr[k] = arr[j];
                i = j;
            }
        }
        return k + 1;
    }
}
