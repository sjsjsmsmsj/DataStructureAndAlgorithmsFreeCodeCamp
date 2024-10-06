
public class ReverseArray {
    public  void main(String args[]) {
        int numbers[] = {2, 11, 5, 10, 7, 8};
        reverseArray(numbers, 0, 5);
        for (int x: numbers) {
            System.out.print(x + " ");
        }
    }
    public  void reverseArray(int numbers[], int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start ++;
            end --;
        }
    }
}
