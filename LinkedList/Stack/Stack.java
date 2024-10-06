public class Stack {
    private ListNode top;
    private int length = 0;
    public class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
        public ListNode() {
            this.data = 0;
            this.next = null;
        }
    }
    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        length ++;
    }

    public int pop() {
        int result = top.data;
        top = top.next;
        length --;
        return result;
    }
    
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
    }
}
