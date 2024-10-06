import java.util.Stack;

public class ReverseString {
    public static String reverseStack(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c: chars) {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i ++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static int[] GreaterElement(int[] arr) {
        int result[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i --) {
            if (!stack.isEmpty()) {
                while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static boolean check(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c: chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == '}' && top == '{') || (c == ']' && top == '[') || (c == ')' && top == '(')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        // String str = "ABCD";
        
        // System.out.println(reverseStack(str));

        // int arr[] = { 4, 7, 3, 4, 8, 1 };
        // int[] a = new int[arr.length];
        // a = GreaterElement(arr);
        // for (int c: a) {
        //     System.out.print(c + " ");
        // }
        String str = "{()}";
        System.out.println("Check open brackets and close brackets: " + check(str));
    }
}
