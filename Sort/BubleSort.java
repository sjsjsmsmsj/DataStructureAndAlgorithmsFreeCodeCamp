// example sort array includes : 3 1 5 2 6 4

// sort increasing
// array before       compare       swap          array after      why i swaped two numbers
// 3 1 5 2 6 4        3 vs 1        yes           1 3 5 2 6 4    because i have seen first number > second number 
// 1 3 5 2 6 4        3 vs 5        no            1 3 5 2 6 4    because i have seen first number < second number
// 1 3 5 2 6 4        5 vs 2        yes           1 3 2 5 6 4    ...
// 1 3 2 5 6 4        5 vs 6        no            1 3 2 5 6 4    ...
// 1 3 2 5 6 4        6 vs 4        yes           1 3 2 5 4 6    ...
// => stop first interator i take maximum 
// if interator contionue i take second maxium

// I think about sorted array increasing right now 
// step 1: 1 interator for (0 -> n - 1 - count) (count: if after interator, i need to change count ++; n = arr.length)
// step 2: 1 interator for (0 -> n - 1) to interator find maxium, second maxium, third maxium
// ok 
public class BubleSort {
    public static void main(String args[]) {
        int arr[] = { 10, 4, 2, 6, 9, 100, 3};
        bubleSorting(arr);
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
    public static void bubleSorting(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length - count - 1; j ++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            count ++;
        }
    }
}
