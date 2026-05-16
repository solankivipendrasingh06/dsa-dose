import java.util.*;
class Node{
    int data;
    Node left,right;
    
    Node(int value){
        data = value;
        left = right = null;
    }
}
public class findDepth{
    public static int maxDepth(Node root){
        if(root == null){
            return 0;
        }
        
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        
        int depth = Math.max(lh,rh)+1;
        return depth;
    } 
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);
        root.left.left.left.left = new Node(6);
        
        System.out.print("Depth of binary tree is :");
        System.out.println(maxDepth(root));
    }
}
