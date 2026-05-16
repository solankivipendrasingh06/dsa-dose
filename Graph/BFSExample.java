import java.util.*;

public class BFSExample {

   static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        boolean visited[] = new boolean[graph.size()];

        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {

            int curr = q.poll();

            System.out.print(curr + " ");

            for(int nbr : graph.get(curr)) {

                if(!visited[nbr]) {

                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
        }
    }
    }
    public static void main(String[] args) {

        int V = 7;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0; i<V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);
        graph.get(2).add(6);

        bfs(graph, 0);
    }
}