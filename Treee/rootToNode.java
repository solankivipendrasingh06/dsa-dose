import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class rootToNode {

    // recursive function
    public static boolean solve(Node root, ArrayList<Integer> arr, int x) {

        if (root == null) {
            return false;
        }

        arr.add(root.data);

        if (root.data == x) {
            return true;
        }

        if (solve(root.left, arr, x) || solve(root.right, arr, x)) {
            return true;
        }

        // backtrack
        arr.remove(arr.size() - 1);

        return false;
    }

    // wrapper function
    public static ArrayList<Integer> answer(Node root, int B) {

        ArrayList<Integer> path = new ArrayList<>();

        if (root == null) {
            return path;
        }

        solve(root, path, B);

        return path;
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int target = 5;

        ArrayList<Integer> ans = answer(root, target);

        System.out.println(ans);
    }
}