import java.io.*;
import java.util.*;

public class n08_hamiltonian {
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

   public static void hamilto(ArrayList<Edge> graph[], int src, HashSet<Integer> visited, String psf, int osrc) {

      if(visited.size()==graph.length-1) {
         System.out.print(psf);
         for(Edge edge: graph[src]) {
            if(edge.nbr==osrc){
              System.out.println("*"); return;
            }
         }
         System.out.println("."); return;
      }

      visited.add(src);
      for(Edge edge: graph[src]) {
         if(visited.contains(edge.nbr)==false) {
            hamilto(graph, edge.nbr, visited, psf+edge.nbr, osrc);
         }
      }
      visited.remove(src);
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner scn = new Scanner(System.in);

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

      int src = Integer.parseInt(br.readLine());

      // write all your codes here
      HashSet<Integer> visited = new HashSet<>();
      hamilto(graph, src, visited, src+"", src);
   }


}