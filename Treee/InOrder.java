package Treee;

class Node{
    int data;
    Node left,right;
    
    public Node(int value){
        data = value;
        left = right = null;
    }
}
public class InOrder{
    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(5);
        root.right.left = new Node(6);
        
        System.out.print("Inorder traversal are : ");
        inOrder(root);
    }
}