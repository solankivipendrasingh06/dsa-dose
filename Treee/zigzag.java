import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class zigzag {
    public static List<List<Integer>> spiral(Node root){
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);   // 🔥 ADD THIS LINE
        
        boolean flag = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new LinkedList<>();
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                if(flag){
                    level.add(curr.data);
                }else{
                    level.add(0,curr.data);
                }
                
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
            result.add(level);
            flag = ! flag;
        }
        return result;
    }
    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        List<List<Integer>> ans = spiral(root);
        System.out.println(ans);
    }
}