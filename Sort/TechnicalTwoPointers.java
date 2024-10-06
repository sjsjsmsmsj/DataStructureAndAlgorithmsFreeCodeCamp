public class TechnicalTwoPointers {
    // Problem: given array {1, 2, 3, 4, 5, 6, 7}
    // result {7, 1, 6, 2, 5, 3, 4} 
    // explain: lagest, smallest, second-lagest, second-smallest, ....
    public static int[] sortProblem(int arr[]) {
        int i = 0; // pointer 1
        int j = arr.length - 1; // pointer 2
        int result[] = new int[arr.length];
        int count = 0;
        for (int k = 0; k < result.length; k ++) {
            if (count % 2 == 0) {
                result[k] = arr[j];
                j --;
                count ++;
            } else {
                result[k] = arr[i];
                i ++;
                count ++;
            }
        }
        return result;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7};
        int temp[] = sortProblem(arr);
        for (int x: temp) {
            System.out.print(x + " ");
        }
    }
}
