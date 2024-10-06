public class MaxHeap {
    private Integer[] heap;
    private int n;
    public MaxHeap(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }
    public boolean isEmpty() {
        return n == 0;
    }
    public int size() {
        return n;
    }
    public void insert(int x) {
        if (n == heap.length - 1) {
            resize(heap.length * 2);
        }
        n ++;
        heap[n] = x;
        swim(n);
    }
    private void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k / 2];
            heap[k / 2] = heap[k];
            heap[k] = temp;
            k = k / 2;
        }
    }
    private void resize(int capacity) {
        Integer temp[] = new Integer[capacity];
        for (int i = 0; i < temp.length - 1; i ++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
    public void swap(int n, int m) {
        int temp = n;
        n = m;
        m = temp;
    }
    public int deleteMax() {
        int max = heap[1];
        swap(max, heap[n]);
        n --;
        sink(1);
        heap[n + 1] = null;
        if (n > 0 && n == (heap.length + 1) / 4) {
            resize(n / 2);
        }
        return max;
    }
    private void sink(int k) {
        while (2 * k < n) {
            int j = 2 * k;
            if (j < n && heap[j] < heap[j + 1]) {
                j ++;
            }
            if (heap[k] >= heap[j]) {
                break;
            }
            swap(heap[k], heap[j]);
            k = j;
        }
    }
    public static void main(String args[]) {
        MaxHeap h = new MaxHeap(2);
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        h.insert(2);
        h.insert(3);
        System.out.println(        h.deleteMax()        );

    }
}