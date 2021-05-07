import java.io.*;
import java.util.*;

public class n09_DFS {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   
   public static class Pair{
       int v;
       String psf;
       Pair(int v, String psf){
           this.v=v;
           this.psf=psf;
       }
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      // write your code here  
      boolean visited[] = new boolean[vtces];
      ArrayDeque<Pair> queue = new ArrayDeque<>();
      queue.add(new Pair(src, src+""));
      
      while(queue.size()>0){
        //   r m* w a*
        // remove
        Pair rem = queue.removeFirst();
        // mark*
        if(visited[rem.v]==true) {
            continue;
        }else{
            visited[rem.v]=true;
        }
        // work
        System.out.println(rem.v+"@"+rem.psf);
        
        for(Edge edge: graph[rem.v]){
            if(visited[edge.nbr]==false){
                queue.add(new Pair(edge.nbr, rem.psf+edge.nbr));
            }
        }
        
      }
      
   }
}