
public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    public class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
        public ListNode () {
            this.data = 0;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enQueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length ++;
    }
    
    public void print() {
        if (isEmpty()) {
            return ;
        } 
        ListNode temp = front;
        while (temp != rear) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print(rear.data);
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length --;
        return result;
    }

    public static void main(String args[]) {
        try {
            Queue queue = new Queue();
            queue.enQueue(1);
            queue.enQueue(2);
            queue.enQueue(3);
            queue.dequeue();
            queue.print();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
