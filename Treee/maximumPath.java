class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class maximumPath {

    static int maxPath = Integer.MIN_VALUE;

    // Returns maximum path sum from current node to any one side
    public static int maxPathSum(Node root) {

        if (root == null) {
            return 0;
        }

        int left = Math.max(0, maxPathSum(root.left));
        int right = Math.max(0, maxPathSum(root.right));

        // Path passing through current node
        int currentPath = left + right + root.data;

        maxPath = Math.max(maxPath, currentPath);

        // Return single side path
        return root.data + Math.max(left, right);
    }

    public static int findMaxPath(Node root) {
        maxPath = Integer.MIN_VALUE;
        maxPathSum(root);
        return maxPath;
    }

    public static void main(String args[]) {

        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println("Maximum Path Sum = " + findMaxPath(root));
    }
}