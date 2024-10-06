
import java.util.Stack;

public class PreOrder {
    TreeNode root;
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

    public void preOrder(TreeNode root) {
        if (root == null) {
            return ;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderStack(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
    public static void main(String[] args) {
        PreOrder p = new PreOrder();
        p.createBinaryTree();
        p.preOrder(p.root);
    }
    
}
