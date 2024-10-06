public class MaxSubArray {
    public static void main(String[] args) {
        
    }
    public static int maxSubArray(int arr[]) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        for (int i = 1; i < arr.length; i ++) {
            currentMax += arr[i];
            if (currentMax <= arr[i]) {
                currentMax = arr[i];
            }
            if (maxSoFar < currentMax) {
                maxSoFar = currentMax;
            }
        }
        return maxSoFar;
    }
}
