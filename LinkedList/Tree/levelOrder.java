import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
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

   public static void levelOrderv(TreeNode root) {
        if (root == null) {
            return ;
        } 
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
   }

   public int findMax(TreeNode root) {
    if (root == null) {
        return Integer.MIN_VALUE;
    }
    int result = root.data;
    int left = findMax(root.left);
    int right = findMax(root.right);
    if (left > result) {
        result = left;
    }
    if (right > result) {
        result = right;
    }
    return result;
   }


    public static void main(String[] args) {
        levelOrder a = new levelOrder();
        a.createBinaryTree();
        System.out.println(a.findMax(a.root));
    }
}
