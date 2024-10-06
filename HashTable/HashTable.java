
public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size; // number of key value pairs in HashTable or number of HashNode

    public HashTable() {
        this(10);
    }
    
    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
        this.size = 0;
    }

    public class HashNode {
        private Integer key;
        private String value;
        private HashNode next;
        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    public int getBucketIndex(int key) {
        return key % buckets.length;
    }
    public void put(Integer key, String value) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                return ;
            }
            head = head.next;
        }
        size ++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
    }
    public String get(Integer key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public String remove(Integer key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode temp = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            temp = head;
            head = head.next;
        }
        size --;
        if (head == null) {
            return null;
        }
        if (temp != null) {
            temp.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }
        return head.value;
    }
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(1, "Thinh");
        hashTable.put(2, "Nhi");
        hashTable.put(3, "Yen");
        hashTable.remove(3);
        System.out.println(hashTable.size());
        System.out.println(hashTable.get(2));
    }
}
