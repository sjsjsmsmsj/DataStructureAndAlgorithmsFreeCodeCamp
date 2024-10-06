public class Reverse {
    public static void main(String args[]) {
        int h = 1234;
        System.out.println(reverse(h));
    }
    public static long reverse(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number *= -1;
        }
        int sum = 0;
        while (number != 0) {
            int c = number % 10;
            sum = sum * 10 + c;
            number /= 10;
        }
        return isNegative ? sum * -1 : sum;
    }
}
