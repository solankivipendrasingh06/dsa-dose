class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class balancedBT {

    // Returns height if balanced, else -1
    public static int checkHeight(Node root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (isBalanced(root)) {
            System.out.println("Balanced Binary Tree");
        } else {
            System.out.println("Not Balanced Binary Tree");
        }
    }
}