
import java.util.Stack;



public class InOrder {
    /*
     * Traverse the left subtree in In order fashion.
     * Visit root node.
        Traverse the right subtree in In order fashion.
     */
    private TreeNode root;
    public class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
    
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
        
    }
    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        
    }

    public static  void inOrder(TreeNode root) {
        if (root == null) {
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void inOrderStack(TreeNode root) {
        if (root == null) {
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    
    public static void main(String[] args) {
        InOrder p = new InOrder();
        p.createBinaryTree();
        inOrderStack(p.root);
        inOrder(p.root);
    }
}
