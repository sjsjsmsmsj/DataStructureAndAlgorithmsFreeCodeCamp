

public class BinarySearchTree {
    private TreeNode root;

    private class TreeNode {
        private int data; // Generic type 
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
        @Override
        public String toString() {
            return String.format("%d", data);
        }
        
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public TreeNode search(TreeNode root,int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public void inOrder(TreeNode root) {
        if (root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public boolean checkBinarySearchTree(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        boolean left = checkBinarySearchTree(root.left, min, root.data);
        if (left) {
            boolean right = checkBinarySearchTree(root.right, root.data, max);
            return right;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(1);
        b.insert(2);
        b.insert(3);
        b.inOrder(b.root);
        System.out.println("\n" + b.search(b.root, 1));
        System.out.println(b.checkBinarySearchTree(b.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
