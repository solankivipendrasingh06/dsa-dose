//program for level order traversal

import java.util.*;

// Node Class
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Main {

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        
    // Level Order Traversal using ArrayList
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
    
        while(!q.isEmpty()){
        Node current = q.poll();
        System.out.print(current.data+" ");
        
        if(current.left != null){
            q.offer(current.left);
        }
        if(current.right != null){
            q.offer(current.right);
        }
        }
    }

    public static void main(String[] args) {

        // Create Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
