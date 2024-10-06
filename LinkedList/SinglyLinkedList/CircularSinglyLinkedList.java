


public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;
    public class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public CircularSinglyLinkedList() {
        this.last = null;
        length = 0;
    }
    public int length() {
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
    }

    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length ++;
    }

    public void print() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.print(first.data + " ");
    }

    // remove first node 
    public ListNode removeFirst() {
        if (isEmpty()) {
            return null;
        }
        ListNode temp = last.next;
        if (last.next == null) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length --;
        return temp;
    }

    public static void main(String args[]) {
        CircularSinglyLinkedList c = new CircularSinglyLinkedList();
        c.insert(1);
        c.insert(2);
        c.insert(3);
        c.removeFirst();
        c.print();
    }
}
