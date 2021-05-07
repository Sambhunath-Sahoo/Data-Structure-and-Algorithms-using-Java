import java.beans.VetoableChangeListener;
import java.io.*;
import java.util.*;

public class n10_isCyclic {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static class Pair {
        int v;
        String psf;

        Pair(int v, String psf) {
            this.v = v;
            this.psf = psf;
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[], int src, boolean visited[]) {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src + ""));

        while (q.size() > 0) {
            Pair rem = q.removeFirst();

            if (visited[rem.v] == true) {
                return true;
            }
            visited[rem.v] = true;

            for (Edge edge : graph[rem.v]) {
                if (visited[edge.nbr] == false) {
                    q.add(new Pair(edge.nbr, rem.psf + edge.nbr));
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        boolean visited[] = new boolean[vtces];
        for (int v = 0; v < vtces; v++) {
            if (visited[v] == false) {
                boolean cycle = isCycle(graph, v, visited);
                if (cycle) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}