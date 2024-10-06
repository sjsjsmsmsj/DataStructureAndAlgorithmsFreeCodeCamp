public class SortSquares {
    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        int[] result = sortSquaresVipPro(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] sortSquaresVipPro(int arr[]) {
        int length = arr.length - 1;
        int i = 0;
        int j = length;
        int[] result = new int[length + 1];
        for (int k = length; k >= 0; k --) {
            if (Math.pow(arr[j], 2) > Math.pow(arr[i], 2)) {
                result[k] = (int) Math.pow(arr[j], 2);
                j --;
            } else {
                result[k] = (int) Math.pow(arr[i], 2);
                i ++;
            }
        }
        return result;
    }
}
