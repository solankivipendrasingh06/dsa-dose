import java.util.*;

public class BipartiteDFS {

    // Method 1 -> DFS Traversal
    public static boolean dfsCheck(int node,
                                   int clr,
                                   ArrayList<ArrayList<Integer>> graph,
                                   int[] color) {

        color[node] = clr;

        for (int neighbor : graph.get(node)) {

            // If uncolored
            if (color[neighbor] == -1) {

                // Color with opposite color
                if (!dfsCheck(neighbor,
                              1 - clr,
                              graph,
                              color)) {

                    return false;
                }
            }

            // Same color found
            else if (color[neighbor] == clr) {

                return false;
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

                if (!dfsCheck(i, 0, graph, color)) {

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