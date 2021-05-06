import java.util.ArrayList;
import java.util.Scanner;

public class n07_perfect_friends {

    public static class Edge {
        int v;
        int n;

        Edge(int v, int n) {
            this.v = v; // vertex
            this.n = n; // neighbour
        }
    }

    public static void getSingleComponent(ArrayList<Edge> graph[], int src, ArrayList<Integer> scc, boolean visited[]) {
        scc.add(src);
        visited[src] = true;
        for (Edge edge : graph[src]) {
            if (visited[edge.n] == false) {
                getSingleComponent(graph, edge.n, scc, visited);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> getConnectedComponent(ArrayList<Edge> graph[]) {
        ArrayList<ArrayList<Integer>> cc = new ArrayList<>();
        boolean visited[] = new boolean[graph.length];
        for (int src = 0; src < graph.length; src++) {
            if (visited[src] != true) {
                ArrayList<Integer> scc = new ArrayList<>();
                getSingleComponent(graph, src, scc, visited);
                cc.add(scc);
            }
        }
        return cc;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        // write your code here

        ArrayList<Edge> graph[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < k; i++) {
            int v1 = scn.nextInt();
            int v2 = scn.nextInt();
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        ArrayList<ArrayList<Integer>> ans = getConnectedComponent(graph);
        ArrayList<Integer> anscount = new ArrayList<>();
        for(int i=0; i<ans.size(); i++) {
            anscount.add(ans.get(i).size());
        }
        int ct = 0;
        for (int i = 0; i < anscount.size(); i++) {
           for(int j=i+1; j<anscount.size(); j++) {
               ct += anscount.get(i) * anscount.get(j);
           }
        }

        System.out.println(ct);
    }
}
