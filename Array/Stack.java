public class Stack {
    private int top;
    private int[] arr;
    public void push(int data) {
        if (isFull()) {
            return ;
        }
        top ++;
        arr[top] = data;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception ("Stack is empty !");
        }
        int result = arr[top];
        top --;
        return result;
    }
    public boolean isEmpty() {
        return top < 0;
    }
    public boolean isFull() {
        return arr.length == top + 1;
    }
}
