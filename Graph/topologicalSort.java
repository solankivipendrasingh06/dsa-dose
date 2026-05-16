import java.util.*;

public class topologicalSort {

    // DFS Function
    public static void dfs(int node, int[] vis,
                           Stack<Integer> st,
                           ArrayList<ArrayList<Integer>> adj) {

        vis[node] = 1;

        // visit neighbours
        for (int i : adj.get(node)) {

            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }

        // push after visiting neighbours
        st.push(node);
    }

    // Topological Sort
    public static int[] topo(int v,
                             ArrayList<ArrayList<Integer>> adj) {

        int[] vis = new int[v];

        Stack<Integer> st = new Stack<>();

        // run dfs for all components
        for (int i = 0; i < v; i++) {

            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }

        // store answer
        int[] ans = new int[v];

        int i = 0;

        while (!st.isEmpty()) {
            ans[i++] = st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

        int v = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        int[] ans = topo(v, adj);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
