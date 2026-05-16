package Treee;

class Node{
    int data;
    Node left , right ;

    public Node(int value){
        data = value;
        left = right = null;
    }
}

public class preOrder {
    static void preOrderr(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrderr(root.left);
        preOrderr(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("PreOrder formath of tree is : ");
        preOrderr(root);
    }
}
