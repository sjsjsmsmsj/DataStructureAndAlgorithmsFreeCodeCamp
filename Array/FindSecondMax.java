
public class FindSecondMax {
    public  void main(String args[]) {
        int arr[] = { 13, 34, 2, 34, 33, 1 };
        System.out.println(findSecondMax(arr));
    }
    public  int findSecondMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }
        return second;
    }
}
