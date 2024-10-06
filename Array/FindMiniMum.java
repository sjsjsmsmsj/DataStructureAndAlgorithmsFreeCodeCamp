public class FindMiniMum {
    public  void main(String args[]) {
        int arr[] = {5, 9, 3, 15, 1, 2};
        System.out.println(findMiniMum(arr));
    }
    public  int findMiniMum(int arr[]) {
        int x = arr[0];
        for (int i = 1; i < arr.length; i ++) {
            if (arr[i] < x) {
                x = arr[i];
            }
        }
        return x;
    }
}