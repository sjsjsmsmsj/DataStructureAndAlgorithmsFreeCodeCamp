

public class FindMssingNumber {
    public  void main(String args[]) {
        int arr[] = { 2, 4, 1, 8, 6, 3, 7 };
        System.out.println(findMissingNumber(arr));
    }
    public  int findMissingNumber(int arr[]) {
        int sum = (arr.length + 1) * (arr.length + 2) / 2;
        for (int i = 0; i < arr.length; i ++) {
            sum = sum - arr[i];
        }
        return sum;
    }
}
