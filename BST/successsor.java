/***
inorder successor
the greatest closest element to the given value
*/
class Node{
    int data;
    Node left,right;
    Node(int value){
        data= value;
        left = right = null;
    }
}
public class successsor{
    public Node Successor(Node root,int tar){
        Node successor = null;
        while(root != null){
            if(tar >= root.data){
                root = root.right;
            }else{//target <= root.data
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }
   public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        successsor obj = new successsor();
        Node ans = obj.Successor(root, 4);

        if (ans != null) {
            System.out.println("Successor: " + ans.data);
        } else {
            System.out.println("No successor found");
        }
    }
}