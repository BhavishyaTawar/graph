import java.util.*;

class CycleDetectionUsingDFS{
    public static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static boolean cycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], int par){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                if(cycleUtil(graph, e.dest, vis, curr)){
                    return true;
                }
            }
            else if(par != e.dest && vis[e.dest]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,0));
        graph[4].add(new Edge(4,2));

        boolean vis[]=new boolean[7];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(cycleUtil(graph,i,vis,-1)){
                    System.out.println("Cycle is present");
                
         
                }else{
                    System.out.println("Cycle is not present");
                }
            }
        }
        // ...existing code...
            }
        // ...existing code...
    }
