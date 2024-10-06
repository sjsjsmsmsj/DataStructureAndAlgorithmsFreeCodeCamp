public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }
    
    public int length() {
        return length;
    }

    //insert last
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length ++;
    }

    // delete first node

    public ListNode deleteFirst() {
        if (isEmpty()) 
            return null;
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length --;
        return temp;
    }


    // delete last node
    public ListNode deleteLast() {
        if (isEmpty())
            return null;
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length --;
        return temp;
    }

    public void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public static void main(String args[]) {
        DoublyLinkedList h = new DoublyLinkedList();
        h.insertLast(1);
        h.insertLast(10);
        h.insertLast(15);
        h.insertLast(20);
        h.deleteFirst();
        h.deleteLast();
        h.deleteLast();
        h.print();
    }
}
