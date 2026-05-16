import java.util.*;

public class BipartiteGraph {

    // Method 1 -> BFS Traversal
    public static boolean bfsCheck(int start,
                                   ArrayList<ArrayList<Integer>> graph,
                                   int[] color) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(start);

        color[start] = 0;

        while (!q.isEmpty()) {

            int node = q.poll();

            for (int neighbor : graph.get(node)) {

                // If uncolored
                if (color[neighbor] == -1) {

                    color[neighbor] = 1 - color[node];

                    q.offer(neighbor);
                }

                // Same color found
                else if (color[neighbor] == color[node]) {

                    return false;
                }
            }
        }

        return true;
    }

    // Method 2 -> Check Bipartite Graph
    public static boolean isBipartite(int V,
                                      ArrayList<ArrayList<Integer>> graph) {

        int[] color = new int[V];

        Arrays.fill(color, -1);

        // For disconnected graph
        for (int i = 0; i < V; i++) {

            if (color[i] == -1) {

                if (!bfsCheck(i, graph, color)) {

                    return false;
                }
            }
        }

        return true;
    }

    // Method 3 -> Main Method
    public static void main(String[] args) {

        int V = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {

            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(0);
        graph.get(0).add(3);

        if (isBipartite(V, graph)) {

            System.out.println("Graph is Bipartite");
        }
        else {

            System.out.println("Graph is NOT Bipartite");
        }
    }
}